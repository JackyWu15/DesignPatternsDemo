package com.hechuangwu.designpatternsdemo.strategy;
/**
 *  策略模式：
 *  同一个类型问题有不同的处理方式，即相同的问题，行为（方法）上有差别，将方法不同的实现独立开来，避免了if-else或switch-case的累赘
 *  但随之策略的增多，子类会累加
 *
 *  android源码中的策略模式：可查看帧动画Animation的Interpolator.getInterpolation插值器的调用
 */


/**
 * Created by cwh on 2019/8/9 0009.
 * 功能: 计算器
 */
public class TransCalculator {
    private CalculateStrategy mCalculateStrategy;
    //不同交通工具有不同的计算方式
    public void setStrategy(Class clz){
        this.mCalculateStrategy = CalculateStrategyFactory.createCalculateStrategy( clz );
    }

    public int calculatePrice(int km){
        return mCalculateStrategy.calculatePrice( km );
    }
}
