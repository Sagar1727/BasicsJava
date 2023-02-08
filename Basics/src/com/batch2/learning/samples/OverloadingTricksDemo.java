package com.batch2.learning.samples;

public class OverloadingTricksDemo {
    public static void main(String[] args) {
        //test(Integer.valueOf(10), Integer.valueOf(20));

        test("null", null);
    }

    static void test(int a, int b) {
        System.out.println("Inside primitive test");
    }

    static void test(Integer a, Integer b){
        System.out.println("Inside Wrapper test");
    }

    static void test(String str1, String str2){
        System.out.println("We are inside string method");
    }

/*    static void test(Emp em1, Emp emp2){
        System.out.println("We are inside Emp method");
    }*/
}

class Emp {

}

//Always it looks for exact match, if not found they only it will check for other
//Ambiguity is a compile time error
