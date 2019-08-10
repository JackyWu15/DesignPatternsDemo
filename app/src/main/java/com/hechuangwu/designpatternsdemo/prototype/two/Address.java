package com.hechuangwu.designpatternsdemo.prototype.two;

/**
 * Created by cwh on 2019/8/8 0008.
 * 功能:
 */
public class Address {
    public String city;
    public String district;
    public String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
