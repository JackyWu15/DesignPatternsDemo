package com.hechuangwu.designpatternsdemo.visitor;

import android.util.Log;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class CEOVisitor extends Visitor{
    private static final String TAG = "CEOVisitor";
    @Override
    public void visit(Engineer engineer) {
        Log.i( TAG, "visit:>>>"+engineer.name+">>>>KPI"+engineer.kpi );
    }

    @Override
    public void visit(Manager engineer) {
        Log.i( TAG, "visit:>>>"+engineer.name+">>>>KPI"+engineer.kpi+">>>>数量"+engineer.getProducts() );
    }
}
