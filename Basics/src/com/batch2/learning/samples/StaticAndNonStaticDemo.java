package com.batch2.learning.samples;

public class StaticAndNonStaticDemo {

    static int a = 100;

    int b = 200;

    public static void main(String[] args) {
        int x = 20;
        //Same class static data
        System.out.println(a);//From static block we can access static data only
        show();

        //Same class Non-static data
        StaticAndNonStaticDemo staticAndNonStaticDemo = new StaticAndNonStaticDemo();
        System.out.println(staticAndNonStaticDemo.b);
        staticAndNonStaticDemo.display();


        //Different class static data access
        System.out.println(Sunny.color);
        Sunny.education();

        //Different class Non-Static data
        Sunny sunny = new Sunny();
        System.out.println(sunny.height);
        sunny.details();



    }

    static {
        int y = 2000;
        System.out.println("This is static block");
        System.out.println(a);
        //System.out.println(b);
    }


    {
        System.out.println("This is Instantiation block");
        System.out.println(a);
        System.out.println(b);
    }

    void display() {
        System.out.println("This is non static method");

        System.out.println(a);//From Non-static block we can access anything
        System.out.println(b);
    }


    static void show() {
        System.out.println("This is Static method");
        System.out.println(a);
        //System.out.println(b);
    }
}


class Sunny {
    int height = 6;
    static String color = "White";

    void details() {

    }

    static void education() {

    }
}
