package com.hechuangwu.designpatternsdemo.strategy;

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:
 */
public class BusStrategy implements  CalculateStrategy {
    int exPrice = 3;
    @Override
    public int calculatePrice(int km) {
        return km*exPrice;
    }
}
