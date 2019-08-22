package com.hechuangwu.designpatternsdemo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cwh on 2019/8/19 0019.
 * 功能:
 */
public class Composite extends Component {
    private List<Component> mComponents = new ArrayList<>(  );
    public Composite(String name) {
        super( name );
    }

    @Override
    public void doSomething() {
        for(Component component:mComponents){
            component.doSomething();
        }
    }

    public void addChild(Component child){
        mComponents.add( child );
    }

    public void removeChild(Component child){
        mComponents.remove( child );
    }

    public Component getChildren(int index){
        if(index<mComponents.size()){
           return mComponents.get( index );
        }
        return null;
    }
}
