package com.hechuangwu.designpatternsdemo.proxy;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class Lawyer implements ILawsuit {
    ILawsuit mILawsuit;

    public Lawyer(ILawsuit ILawsuit) {
        mILawsuit = ILawsuit;
    }

    @Override
    public void submit() {
        mILawsuit.submit();
    }

    @Override
    public void burden() {
        mILawsuit.burden();
    }

    @Override
    public void defend() {
        mILawsuit.defend();
    }

    @Override
    public void finish() {
        mILawsuit.finish();
    }
}
