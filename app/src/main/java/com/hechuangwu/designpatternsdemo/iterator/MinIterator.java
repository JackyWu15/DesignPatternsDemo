package com.hechuangwu.designpatternsdemo.iterator;

import java.util.List;

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:
 */
public class MinIterator implements Iterator {
    private List<Employee> mList;
    private int position;

    public MinIterator(List<Employee> list) {
        mList = list;
    }

    @Override
    public boolean hasNext() {
        return !(position>mList.size()-1||mList.get( position )==null);
    }

    @Override
    public Object next(){
        Employee e = mList.get(position);
        position++;
        return  e;
    }


}
