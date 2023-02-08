package com.batch2.learning.samples;

public class OverloadingDemo {
    public static void main(String[] args) {
        OverloadingDemo overloadingDemo = new OverloadingDemo();
        System.out.println("Addition Of 2 Integers:" + overloadingDemo.addition(10, 20));
        System.out.println("Addition Of 3 Integers:" + overloadingDemo.addition(10, 20, 30));
        System.out.println("Concatenation Of 2 Strings:" + overloadingDemo.addition("Suresh", "Bethala"));

        overloadingDemo.addition(10, 20, 30, 40);
    }

    int addition(int a, int b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    void addition(int a, int b, int c, int d) {
        System.out.println("Sum:" + (a + b + c + d));
    }

    double addition(double d1, double d2){
        return d1 + d2;
    }

    String addition(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}

// Over loading will happen within the class only
