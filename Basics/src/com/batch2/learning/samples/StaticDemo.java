package com.batch2.learning.samples;

public class StaticDemo {

    static {
        System.out.println("Static Block 1");
    }

    public static void main(String[] args) {
        Data data = new Data();

        data.displayIdAndName();//Calling statement of the method

        System.out.println("END");

        System.out.println("Sum of 10 numbers is:" + data.sum(10));

        System.out.println("FullName is :" + data.getFullName("Bethala", "Suresh"));
        System.out.println("FullName length is :" + data.getLengthOfName("Bethala", "Suresh"));
    }

    static {
        System.out.println("This is static Block 2");
    }
}


class Data {
    int id = 10;
    String name = "Java 8";

    void displayIdAndName() {//Definition of the method
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
    }


    int sum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //access_modifiers(optional) return_type(mandatory) method_name(mandatory)(parameter_list(optional)) {
    ///body
    //}


    int getLengthOfName(String firstname, String lastName) {
        return (firstname + " " + lastName).length();
    }
}

//what is the starting point for compilation: class
//what is the starting point for execution is? main()

//What is the purpose of static in Java?
//Static data can be used without creating any object
