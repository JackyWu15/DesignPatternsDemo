package com.hechuangwu.designpatternsdemo.decorator;

/**
 * Created by cwh on 2019/8/22 0022.
 * 功能:
 */
public abstract class PersonCloth extends Person {
    protected Person mPerson;

    public PersonCloth(Person person) {
        mPerson = person;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }
}
