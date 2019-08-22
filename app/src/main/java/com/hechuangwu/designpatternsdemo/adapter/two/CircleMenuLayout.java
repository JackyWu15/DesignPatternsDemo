package com.hechuangwu.designpatternsdemo.adapter.two;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.hechuangwu.designpatternsdemo.R;

import java.util.List;

/**
 * Created by cwh on 2019/8/21 0021.
 * 功能:
 */
public class CircleMenuLayout extends ViewGroup {
    private int[] images;
    private String[] texts;
    private int menuItemCount;
    private int menuItemLayoutId = R.layout.circle_menu_item;
    private OnMenuItemClickListener mOnMenuItemClickListener;
    private int radius;
    private static  final float RADIO_DEFAULT_CHILD_DIMENSION = 1/4f;
    private static final float RADIO_PADDING_LAYOUT = 1/12f;
    private float padding;
    private double startAngle;
    private ListAdapter mListAdapter;

    public CircleMenuLayout(Context context) {
        this( context,null );
    }

    public CircleMenuLayout(Context context, AttributeSet attrs) {
        this( context, attrs ,0);
    }

    public CircleMenuLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super( context, attrs, defStyleAttr );
        setPadding(0,0,0,0);
    }


    //    private void buildMenuItems() {
    //
    //        for (int i = 0; i < menuItemCount; i++) {
    //            View view = inflateMenuView( i );
    //            initMenuItem(view,i);
    //            addView( view );
    //        }
    //    }

    private void initMenuItem(View view, int i) {
        ImageView iv_image = view.findViewById( R.id.iv_image );
        TextView tv_title  = view.findViewById( R.id.tv_title );
        iv_image.setVisibility( VISIBLE );
        iv_image.setImageResource( images[i] );

        tv_title.setVisibility( VISIBLE );
        tv_title.setText( texts[i] );
    }
    private View inflateMenuView(final  int childIndex){
        LayoutInflater from = LayoutInflater.from( getContext() );
        View inflate = from.inflate( menuItemLayoutId, this, false );
        inflate.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnMenuItemClickListener!=null){
                    mOnMenuItemClickListener.onClick( v,childIndex );
                }
            }
        } );
        return inflate;
    }

    //-----------------------------------adapter模式-----------------------------------------------
    public void setAdapter(ListAdapter listAdapter) {
        mListAdapter = listAdapter;
    }


    private void buildMenuItems(){

        for (int i = 0; i < mListAdapter.getCount(); i++) {
            final View view = mListAdapter.getView( i, null, this );
            final int position  = i;
            view.setOnClickListener( new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mOnMenuItemClickListener!=null){
                        mOnMenuItemClickListener.onClick(view,position );
                    }
                }
            } );
            addView( view );
        }
    }

    @Override
    protected void onAttachedToWindow() {
        if(mListAdapter!=null){
            buildMenuItems();
        }
        super.onAttachedToWindow();
    }

    static class MenuItem{
        public int imageId;
        public String title;

        public MenuItem(int imageId, String title) {
            this.imageId = imageId;
            this.title = title;
        }
    }

    static class CircleMenuAdapter extends BaseAdapter{
        List<MenuItem> mMenuItems;

        public CircleMenuAdapter(List<MenuItem> menuItems) {
            mMenuItems = menuItems;
        }

        @Override
        public int getCount() {
            if(mMenuItems!=null){
                return mMenuItems.size();
            }
            return 0;
        }

        @Override
        public MenuItem getItem(int position) {
            if(mMenuItems!=null){
                return mMenuItems.get( position );
            }
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater from = LayoutInflater.from( parent.getContext() );
            View inflate = from.inflate( R.layout.circle_menu_item, parent, false );
            initMenuItem(inflate,position);

            return inflate;
        }

        private void initMenuItem(View view,int position){
            MenuItem item = getItem( position );
            ImageView iv_image = view.findViewById( R.id.iv_image );
            TextView tv_title  = view.findViewById( R.id.tv_title );
            iv_image.setImageResource( item.imageId );
            tv_title.setText( item.title );
        }
    }
    //-----------------------------------adapter模式-----------------------------------------------





    public void setMenuItemIconsAndTexts(int[] images,String[] texts){
        if(images==null&&texts==null){
            throw new IllegalArgumentException( "菜单项文本和图片只是填充一个" );
        }

        this.images = images;
        this.texts = texts;

        menuItemCount = this.images==null?texts.length:images.length;
        if(this.images!=null&&this.texts!=null){
            menuItemCount = Math.min( images.length,texts.length );
        }

//        buildMenuItems();
    }



    public void setMenuItemLayoutId(int menuItemLayoutId) {
        this.menuItemLayoutId = menuItemLayoutId;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        mOnMenuItemClickListener = onMenuItemClickListener;
    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure( widthMeasureSpec,heightMeasureSpec );
        //测量自己
        measureMyself(widthMeasureSpec,heightMeasureSpec);
        //测量子View
        measureChild();


    }
    private void measureMyself(int widthMeasureSpec, int heightMeasureSpec) {
        int resWidth = 0;
        int resHeight = 0;
        int width = MeasureSpec.getSize( widthMeasureSpec );
        int widthMode = MeasureSpec.getMode( widthMeasureSpec );
        int height = MeasureSpec.getSize( heightMeasureSpec );
        int heightMode  = MeasureSpec.getMode( heightMeasureSpec );

        //如果父类的宽高都不确定
        if(widthMode!=MeasureSpec.EXACTLY||heightMode!=MeasureSpec.EXACTLY){
            //主要是背景图
            resWidth = getDefaultSize( getSuggestedMinimumWidth(),widthMeasureSpec );
            resHeight = getDefaultSize( getSuggestedMinimumHeight(),heightMeasureSpec );
        }else {
            //确定了，那么取最小值
            resWidth = resHeight = Math.min( width,height );
        }
        //设置自身大小
        setMeasuredDimension( resWidth,resHeight );

    }
    private void measureChild() {
        this.radius = Math.max( getMeasuredWidth(), getMeasuredHeight() )/2;
        int childCount = getChildCount();
        int childSize = (int) (this.radius * RADIO_DEFAULT_CHILD_DIMENSION);
        int childMode = MeasureSpec.EXACTLY;

        for (int i = 0; i < childCount; i++) {
            View child = getChildAt( i );
            if(child.getVisibility()==GONE){
                continue;
            }
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec( childSize,childMode );
            child.measure( makeMeasureSpec,makeMeasureSpec );

        }
        padding = RADIO_PADDING_LAYOUT*this.radius;


    }



    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        int childCount = getChildCount();
        int left,top;

        int itemWidth = (int) (this.radius * RADIO_DEFAULT_CHILD_DIMENSION);

        int angleDelay = 360 / childCount;
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt( i );
            if(child.getVisibility()==GONE){
                continue;
            }

            startAngle%=360;

            float distanceFromCenter = this.radius / 2f - itemWidth / 2 - this.padding;
            left = this.radius/2+(int)Math.round( distanceFromCenter*Math.cos( Math.toRadians( startAngle ) )-1/2f*itemWidth );
            top =  this.radius/2+(int)Math.round( distanceFromCenter*Math.sin( Math.toRadians( startAngle ) )-1/2f*itemWidth );

            child.layout( left,top,left+itemWidth,top+itemWidth );
            startAngle +=angleDelay;
        }
    }
}
