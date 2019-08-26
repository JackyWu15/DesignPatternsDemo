package com.hechuangwu.designpatternsdemo.facade;

/**
 *  外观模式：
 *  将内部的通信统一成一个对象并提供接口，以供外部使用。
 *
 *  android源码中的外观模式：Context 封装了许多个重要的接口，如startActivity，其实际实现是通过ActivityManagerService调用
 */

/**
 * Created by cwh on 2019/8/26 0026.
 * 功能: 手机
 */
public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCamera();


    public void call(){
        mPhone.call();
    }

    public void hangup(){
        mPhone.hangup();
    }

    public void takePicture(){
        mCamera.open();
        mCamera.takePicture();
        mCamera.close();
    }

}
