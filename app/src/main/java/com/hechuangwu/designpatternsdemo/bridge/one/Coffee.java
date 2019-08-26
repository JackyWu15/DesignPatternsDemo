package com.hechuangwu.designpatternsdemo.bridge.one;

/**
 *  桥接模式：
 *  将两个层级的抽象部分与实现部分进行分离，在抽象层之间建立关联，可以实现不同层级的解耦和扩展，这里的“抽象层之间关联类”就是不同层级实现类间的桥梁。
 *
 *  android源码中的桥接模式：
 */



/**
 * Created by cwh on 2019/8/26 0026.
 * 功能: 抽象部分
 */
public abstract class Coffee {
    protected  CoffeeAdditives mCoffeeAdditives;

    public Coffee(CoffeeAdditives coffeeAdditives) {
        mCoffeeAdditives = coffeeAdditives;
    }

    public abstract void makeCoffee();

}
