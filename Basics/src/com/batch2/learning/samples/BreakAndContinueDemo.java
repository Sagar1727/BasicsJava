package com.batch2.learning.samples;

import java.util.Scanner;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        int[] arr = {20, 3, 5, 6, 78, 12, 34, 56, 78, 90};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number to search in array:");

        int number = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println("Found");
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Not Found");
            }
        }
    }
}
