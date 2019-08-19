package com.hechuangwu.designpatternsdemo.visitor;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);
}
