package com.batch2.learning.test;

public class Test {
    public static void main(String[] args) {
        C c = new C(3,6);
        c.test();

    }
}

class A {
    public A() {
        super();
        System.out.println("Inside A");
    }

    void test() {


    }
}

class B extends A {
    B() {
        super();
        System.out.println("inside b1");
    }

    @Override
    void test() {
        System.out.println("sagar");
    }
}

class C extends B {
    C(int a ,int b) {
        super();
        System.out.println(a);
        System.out.println(b);
    }

    void main() {

    }
}
