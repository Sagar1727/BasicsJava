package com.batch2.learning.innerclasses.anynomousinner.type2;

public interface MyInterface {
    void details();
}

class Outer {

    MyInterface myInterface = new MyInterface() {
        @Override
        public void details() {
            System.out.println("We are in details() of anonymous inner class");
        }

        void show() {
            System.out.println("We are in show() of anonymous inner class");
        }
    };

}


class Example implements MyInterface {

    @Override
    public void details() {
        System.out.println("We are in details() Example");
    }

    void show() {
        System.out.println("We are in show() of Example");
    }
}

class Example2 implements MyInterface {

    @Override
    public void details() {
        System.out.println("We are in details() Example2");
    }

    void show() {
        System.out.println("We are in show() of Example2");
    }
}

class Test {
    public static void main(String[] args) {
        MyInterface myInterface = new Example2();
        myInterface.details();//This line has many forms

        Example2 example2 = new Example2();
        example2.show();
    }
}

