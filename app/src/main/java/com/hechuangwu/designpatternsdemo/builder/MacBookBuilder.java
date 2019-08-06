package com.hechuangwu.designpatternsdemo.builder;

/**
 * Created by cwh on 2019/8/6 0006.
 * 功能:具体的Builder类
 */
public class MacBookBuilder extends Builder {
    private Computer mComputer = new MacBook();

    @Override
    public Builder buildBoard(String board) {
        mComputer.setBoard( board );
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setDisplay( display );
        return this;
    }

    @Override
    public Builder buildOS() {
        mComputer.setOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
