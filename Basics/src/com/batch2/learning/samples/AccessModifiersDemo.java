package com.batch2.learning.samples;

public class AccessModifiersDemo {



    public static void main(String[] args) {
        /*int a = 10;

        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
        accessModifiersDemo.display();*/
        Test test = new Test();
        //System.out.println(test.id);
        System.out.println(test.name);
        System.out.println(test.salary);
        System.out.println(test.joinDate);
    }

    private void display()  {
        int a = 20;
    }


}



//private, default, protected and public
//Encapsulation: Protecting the data from outside world from the class is called Encapsulation
