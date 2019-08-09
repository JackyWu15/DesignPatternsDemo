package com.hechuangwu.designpatternsdemo.factory;

/**
 * Created by cwh on 2019/8/8 0008.
 * 功能:
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
