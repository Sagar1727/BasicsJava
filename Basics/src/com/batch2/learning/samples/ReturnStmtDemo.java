package com.batch2.learning.samples;

public class ReturnStmtDemo {
    public static void main(String[] args) {
        System.out.println(new ReturnStmtDemo().test());
    }


    int test() {
        int a = 200;
        if (a > 300) {
            return 10;
        } else if (a < 100) {
            return 20;
        }else {
            System.out.println("we are in else");
            //return 200;
        }

        //System.out.println("END");
        return 0;
    }
}


//Return statement is always the last statement in flow
