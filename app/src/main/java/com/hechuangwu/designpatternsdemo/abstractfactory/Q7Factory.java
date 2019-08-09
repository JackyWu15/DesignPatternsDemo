package com.hechuangwu.designpatternsdemo.abstractfactory;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:Q7
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createITire() {
        return new SUVlTire();
    }

    @Override
    public IEngine createIEngine() {
        return new ImportEngine();
    }
}
