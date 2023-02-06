package com.batch2.learning.samples;

import java.util.Scanner;

public class SwitchExampleDemo {
    public static void main(String[] args) {
        System.out.println("Enter Day:");
        String day = new Scanner(System.in).next();
        switch(day){
            case "Monday":
                System.out.println("Spring boot Learning");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("Core Java Learning");
                break;
            case "Thursday":
                System.out.println("Spring Learning");
                break;
            case "Friday":
            case "Saturday":
                System.out.println("Hibernate Learning");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
