package com.hechuangwu.designpatternsdemo.visitor;

import java.util.Random;

/**
 * Created by cwh on 2019/8/16 0016.
 * 功能:
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super( name );
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit( this );
    }

    public  int getCodeLines(){
        return  new Random().nextInt(10*10000);
    }
}
