package com.hechuangwu.designpatternsdemo.strategy;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:
 */
public class CalculateStrategyFactory {

    public static <T extends CalculateStrategy> T createCalculateStrategy(Class<T> clz){
        CalculateStrategy calculateStrategy = null;
        try {
            calculateStrategy = (CalculateStrategy) (Class.forName( clz.getName() )).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)calculateStrategy;

    }
}
