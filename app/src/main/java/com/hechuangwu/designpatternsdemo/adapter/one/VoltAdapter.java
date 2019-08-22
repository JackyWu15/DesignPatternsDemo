package com.hechuangwu.designpatternsdemo.adapter.one;

/**
 * Created by cwh on 2019/8/22 0022.
 * 功能:
 */
public class VoltAdapter implements FiveVolt {
    Volt220 mVolt220;

    public VoltAdapter(Volt220 volt220) {
        this.mVolt220 = volt220;
    }

    public int getVolt220() {
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
