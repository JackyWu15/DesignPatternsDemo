package com.hechuangwu.designpatternsdemo.bridge.one;

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能:
 */
public class Ordinary extends CoffeeAdditives {
    @Override
    public String addSomething() {
        return "原味";
    }
}
