package com.batch2.learning.innerclasses.staticinnerclasses;

public class Outer {

    static int id = 1000;

    static void display() {
        System.out.println("We are in display()...");
    }

    static {

    }

    static class Inner {
        private int a = 200;

        public void show() {
            int y = 200;
            System.out.println("We are in show()");
            System.out.println(a);
            System.out.println(y);
        }
    }
}
