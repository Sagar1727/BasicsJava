package com.batch2.learning.innerclasses.methodlocal;

public class Outer {

    int a = 200;

    void m2() {
        System.out.println("We are in m2");
    }

    void m1() {
        int abc = 20;
        class Inner {
            private int g;
            public void display() {
                Outer outer = new Outer();
                outer.m2();

                System.out.println(abc);
                System.out.println(a);
            }
        }

        Inner inner = new Inner();
        inner.display();
    }


}
