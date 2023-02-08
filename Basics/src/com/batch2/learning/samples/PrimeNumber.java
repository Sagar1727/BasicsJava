package com.batch2.learning.samples;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i < number/2; i++) {
            if (number % i == 0) {
                counter = counter + 1;
            }
        }

        if (counter == 2) {
            System.out.println("The given number is Prime");
        } else {
            System.out.println("Not a prime number");
        }
    }
}


