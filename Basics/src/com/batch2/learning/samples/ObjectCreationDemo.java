package com.batch2.learning.samples;

public class ObjectCreationDemo {
    public static void main(String[] args) {

        //syntax
        //class_name reference_variable = new class_name();
        ObjectCreationDemo objectCreationDemo = new ObjectCreationDemo();
        User user = new User();
    }
}

class User {
    int id = 10;
    String name = "Suresh";
    double salary = 30000;
    char gender = 'M';
}
