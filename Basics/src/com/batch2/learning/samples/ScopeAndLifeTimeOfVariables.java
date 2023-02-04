package com.batch2.learning.samples;

public class ScopeAndLifeTimeOfVariables {//Class Scope/Lifetime start here

    static int classLevelVariable = 20;

    public static void main(String[] args) {
        int a = 3;
        System.out.println(classLevelVariable);
    }

    static void display() {
        int b = 30;
        System.out.println(classLevelVariable);
        System.out.println(b);
    }

    static void show() {
        //System.out.println(b);
        System.out.println(classLevelVariable);
    }

}//Class Scope/Lifetime ends here.
