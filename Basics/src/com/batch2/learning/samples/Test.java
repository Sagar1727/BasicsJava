package com.batch2.learning.samples;

import java.util.Date;

public class Test {
    private int id = 10;//Private members can be accessed within the class
    String name = "Suresh";

    protected double salary = 34000;

    public Date joinDate = new Date();


    void show() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(joinDate);
    }
}
