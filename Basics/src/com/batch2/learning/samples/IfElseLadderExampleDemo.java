package com.batch2.learning.samples;

public class IfElseLadderExampleDemo {
    public static void main(String[] args) {
        int a = 50, b= 50, c = 50;

        if(a > b && a > c){
            System.out.println("A is big");
        }else if( b > a && b > c){
            System.out.println("B is Big");
        }else if(c > a && c > b){
            System.out.println("C is Big");
        }else {
            System.out.println("All are equal");
        }

        System.out.println("End");
    }
}
