package com.hechuangwu.designpatternsdemo.visitor;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public abstract class Visitor {
    public abstract void visit(Engineer engineer);
    public abstract void visit(Manager engineer);

}
