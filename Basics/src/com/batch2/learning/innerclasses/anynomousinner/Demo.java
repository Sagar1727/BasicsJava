package com.batch2.learning.innerclasses.anynomousinner;

public abstract class Demo {
    public void show() {
        System.out.println("We are in show() of super class");
    }

    abstract void display();
}

class Outer {

    //Anonymous inner class
    Demo demo = new Demo() {

        public void show() {
            System.out.println("We are in show() of anonymous inner lass");
        }

        @Override
        void display() {
            System.out.println("we are in display() anonymous inner class");
        }
    };
}

