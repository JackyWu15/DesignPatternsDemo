package com.hechuangwu.designpatternsdemo.visitor;

import android.util.Log;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class CTOVisitor extends Visitor {
    private static final String TAG = "CTOVisitor";

    @Override
    public void visit(Engineer engineer) {
        Log.i( TAG, "visit:>>>"+engineer.name+">>>代码量"+engineer.getCodeLines() );
    }

    @Override
    public void visit(Manager engineer) {
        Log.i( TAG, "visit:>>>"+engineer.name+">>>产品数量"+engineer.getProducts() );
    }
}
