package com.hechuangwu.designpatternsdemo.factory;
/**
 *  简单工厂模式：
 *  生成任何复杂对象时都可以使用工厂方法
 *
 *  android源码中的普通工厂模式：源码中很多地方都使用了普通工厂模式，比如setContentView(new RelativeLayout())就是普通工厂模式的调用，返回给frameworks处理
 */

/**
 * Created by cwh on 2019/8/8 0008.
 * 功能:
 */
public class AudiCarFactory {
    public static  <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar audiCar = null;
        try {
           audiCar = (AudiCar) (Class.forName( clz.getName() )).newInstance();
        } catch (Exception  e) {
            e.printStackTrace();
        }
        return (T)audiCar;
    }
}
