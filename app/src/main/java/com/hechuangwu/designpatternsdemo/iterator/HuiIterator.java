package com.hechuangwu.designpatternsdemo.iterator;

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:
 */
public class HuiIterator implements Iterator {
    private Employee[] mEmployees = null;
    private int position;

    public HuiIterator(Employee[] employees) {
        mEmployees = employees;
    }

    @Override
    public boolean hasNext() {
        return !(position>mEmployees.length-1||mEmployees[position]==null);
    }

    @Override
    public Object next(){
        Employee employee = mEmployees[position];
        position++;
        return employee;
    }
}
