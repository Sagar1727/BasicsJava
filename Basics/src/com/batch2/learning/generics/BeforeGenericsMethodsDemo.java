package com.batch2.learning.generics;

public class BeforeGenericsMethodsDemo {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.67, 20.32));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }


}
