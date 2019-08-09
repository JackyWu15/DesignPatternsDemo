package com.hechuangwu.designpatternsdemo.abstractfactory;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:Q3
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createITire() {
        return new NormalTire();
    }

    @Override
    public IEngine createIEngine() {
        return new DomesticEngine();
    }
}
