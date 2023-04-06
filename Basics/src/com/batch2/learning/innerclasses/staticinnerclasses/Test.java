package com.batch2.learning.innerclasses.staticinnerclasses;

public class Test {
    public static void main(String[] args) {
        Outer.display();
        System.out.println(Outer.id);

        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
