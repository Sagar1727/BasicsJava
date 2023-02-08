package com.batch2.learning.samples;

public class VarArgsDemo {
    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(addition(2, 3, 4));
        System.out.println(addition(2, 3, 4, 5));
        System.out.println(addition(2, 3, 4, 5, 6));
        System.out.println(addition(2, 3, 4, 5, 6, 7));
        System.out.println(addition(2, 3, 4, 5, 6, 7, 8));
        System.out.println(addition(2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(addition(2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    /*static int addition(int a, int b) {
        return a + b;
    }
,
    static int addition(int a, int b, int c) {
        return a + b + c;
    }

    static int addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/

    static int addition(int... values) {
        int sum = 0;
        for (int a : values) {
            sum = sum + a;
        }
        return sum;
    }
}
