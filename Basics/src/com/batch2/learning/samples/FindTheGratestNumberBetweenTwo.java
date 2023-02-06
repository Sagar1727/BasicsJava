package com.batch2.learning.samples;

import java.util.Scanner;

public class FindTheGratestNumberBetweenTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 2 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Num1 is grater");
        } else {
            System.out.println("Num2 is grater");
        }

        System.out.println("END");

        System.out.println("Enter the String:");
        String str = scanner.next();

        FindTheGratestNumberBetweenTwo findTheGratestNumberBetweenTwo = new FindTheGratestNumberBetweenTwo();
        //System.out.println(findTheGratestNumberBetweenTwo.checkStringsStartWith(str));
        System.out.println("Start with Java :" + findTheGratestNumberBetweenTwo.checkStringsStartWith(str));

        /*int result;
        result = findTheGratestNumberBetweenTwo.add(10, 20);
        System.out.println("Result:"+result);*/

        System.out.println("Result:" + findTheGratestNumberBetweenTwo.add(30, 40));

    }


    String checkStringsStartWith(String str) {
        if (str.startsWith("Java")) {
            return "Yes";
        } else {
            return "No";
        }
    }

    int add(int a, int b) {
        return a + b;
    }
}
