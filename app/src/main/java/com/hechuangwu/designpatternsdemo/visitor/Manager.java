package com.hechuangwu.designpatternsdemo.visitor;

import java.util.Random;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class Manager extends Staff{
    private int products;
    public Manager(String name) {
        super( name );
        products = new Random(  ).nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit( this );
    }

    public  int getProducts(){
        return products;
    }
}
