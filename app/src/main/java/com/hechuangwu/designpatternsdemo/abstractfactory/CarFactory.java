package com.hechuangwu.designpatternsdemo.abstractfactory;

/**
 *  抽象工厂模式：
 *  1,和普通工厂模式不同是，抽象工厂类将"工厂"进行抽象，使得不同具体工厂创建的产品有所不同
 *  2,抽象工厂类会造成定义过多的类，实际开发上，大部分情况下使用普通工厂已经足够了
 *
 *  android源码中的抽象工厂模式：可查看Native层MediaPlayerFactory::createPlayer(player_type playerType,void* cookie,notify_callback_f notifyFunc)创建过程，会创建StagefrightPlayer，NuPlayer,SonivoxPlayer, TestPlayer 4种Player
 */

/**
 * Created by cwh on 2019/8/9 0009.
 * 功能:抽象工厂类
 */
public abstract class CarFactory {
    public abstract ITire createITire();
    public abstract IEngine createIEngine();
}
