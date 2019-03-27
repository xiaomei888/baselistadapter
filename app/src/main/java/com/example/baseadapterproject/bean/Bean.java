package com.example.baseadapterproject.bean;

/**
 * 慎   人之所以能,是因为相信自己能
 * 2019/3/26
 */
public class Bean {
    private String name;
    private String address;
    private int age;

    public Bean(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
