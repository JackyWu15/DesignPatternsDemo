package com.hechuangwu.designpatternsdemo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cwh on 2019/8/15 0015.
 * 功能:
 */
public class CompanyMin implements Company {
    private List<Employee> list = new ArrayList<>(  );

    public CompanyMin(){
        list.add( new Employee( "jacky",12,"男" ) );
        list.add( new Employee( "jacky_wu",12,"男" ) );
    }

    public List<Employee> getList() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator( list );
    }
}
