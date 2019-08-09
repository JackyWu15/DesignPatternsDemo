package com.hechuangwu.designpatternsdemo.strategy;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:
 */
public class TranficCalculator {
    private CalculateStrategy mCalculateStrategy;
    public void setStrategy(CalculateStrategy calculateStrategy){
        this.mCalculateStrategy = calculateStrategy;
    }

    public int calculatePrice(int km){
        return mCalculateStrategy.calculatePrice( km );
    }
}
