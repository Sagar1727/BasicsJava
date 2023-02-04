package com.batch2.learning.samples;

public class LocalAndGlobalVariablesDemo {

    //Global Variables
    static byte b = -127;
    static short sh;
    static int i;
    static long l;

    //Floating Point numbers
    static float f;
    static double d;

    //Character
    static char ch;

    //Boolean
    static boolean bool;

    //Reference Types
    static String str;

    public static void main(String[] args) {
        int a = 10;
        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(str);

        //local
        System.out.println(a);

    }

    void display() {
        int b;
    }
}

