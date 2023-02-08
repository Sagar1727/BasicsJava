package com.batch2.learning.samples;

public class CallByValueDemo {
    public static void main(String[] args) {
        int a = 20, b = 30;
        System.out.println("Before calling the callByValue method to increment values A:" + a + ", B:" + b);
        new CallByValueDemo().callByValue(a,b);
        System.out.println("After calling the callByValue method to increment values A:" + a + ", B:" + b);
    }

    void callByValue(int p, int q) {
        p = p + 10;
        q = q + 20;
    }
}
