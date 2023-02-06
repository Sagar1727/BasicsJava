package com.batch2.learning.samples;

import java.util.Scanner;

public class SkipMultiplesOf5Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
