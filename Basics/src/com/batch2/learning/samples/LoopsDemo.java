package com.batch2.learning.samples;

public class LoopsDemo {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        /*int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        *//*int i = 1;
        do {
            sum = sum + i;
            i++;
        }while(i <= n);*/

        System.out.println("Sum :" + sum);
    }
}
// 3 types of loops 1) while 2) do - while, 2)for
