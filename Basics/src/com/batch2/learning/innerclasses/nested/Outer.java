package com.batch2.learning.innerclasses.nested;

class Outer {

    protected static int a;

    static void display(){

    }

    public void m1() {
        int x = 100;
        System.out.println("We are in m1()");
    }

    public void m3() {
        System.out.println("We are in m3()");
    }

    class Inner {
        final int abc = 10;

        static void m2() {

            final int p;
            System.out.println("We are in m2()");
            Outer outer = new Outer();
            outer.m3();
        }
    }

    interface int1 {

    }
}

//JVM, JDK and JRE
