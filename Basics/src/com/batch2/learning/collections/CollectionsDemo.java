package com.batch2.learning.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
    }
}

interface MyInt {
    void test();
}

class MyCla implements MyInt {

    @Override
    public void test() {

    }
}


class Test{
    public static void main(String[] args) {
        MyInt myInt = new MyCla();
    }
}