package com.batch2.learning.samples;

public class CallByReferenceDemo {
    public static void main(String[] args) {
        Info info = new Info();

        /*Info info2 = info;

        System.out.println(info.hashCode());
        System.out.println(info2.hashCode());*/


        System.out.println("Before A:" + info.a + ", B:" + info.b);
        CallByReferenceDemo callByReferenceDemo = new CallByReferenceDemo();
        callByReferenceDemo.callByReference(info);
        System.out.println("After A:" + info.a + ", B:" + info.b);
    }


    void callByReference(Info info2) {
        info2.a = info2.a + 100;
        info2.b = info2.b + 200;
    }
}

class Info {
    int a = 20;
    int b = 30;
}
