package com.hechuangwu.designpatternsdemo.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 *  访问者模式：
 *  需要对一个对象结构中的对象进行不同的操作，通常开发上较少使用
 */


/**
 * Created by cwh on 2019/8/16 0016.
 * 功能: 报表管理类
 */
public class BusinessReport {
    List<Staff> mStaff = new LinkedList<>(  );

    public BusinessReport(){
        mStaff.add( new Manager( "经理" ) );
        mStaff.add( new Engineer( "工程A" ) );
        mStaff.add( new Engineer( "工程B" ) );
        mStaff.add( new Engineer( "工程C" ) );
        mStaff.add( new Engineer( "工程D" ) );
    }


    public void showReport(Visitor visitor){
        for (Staff staff:mStaff){
            staff.accept( visitor );
        }
    }
}
