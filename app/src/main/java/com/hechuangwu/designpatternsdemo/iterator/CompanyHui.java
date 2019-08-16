package com.hechuangwu.designpatternsdemo.iterator;

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:
 */
public class CompanyHui implements Company {
    private Employee[] mEmployees = new Employee[2];

    public CompanyHui(){
        mEmployees[0]=new Employee( "jacky_wu",12,"男" );
        mEmployees[1]=new Employee( "jacky",12,"男" );
    }

    public Employee[] getList() {
        return mEmployees;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator( mEmployees );
    }
}
