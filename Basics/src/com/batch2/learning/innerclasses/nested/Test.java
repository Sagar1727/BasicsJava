package com.batch2.learning.innerclasses.nested;

import com.batch2.learning.innerclasses.nested.Outer;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m3();

        Outer.Inner inner = new Outer().new Inner();
        inner.m2();
    }
}
