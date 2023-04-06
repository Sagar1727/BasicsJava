package com.sagar.homework;

public class ConstructorsDemoPractice {
    public static void main(String[] args) {
        Valentine valentine = new Valentine(10, "sagar", 50000);
        Valentine valentine1 = new Valentine(20, "girish", 40000);
        Valentine valentine2 = new Valentine(30, "sunny", 30000);
        Valentine valentine3 = new Valentine(30, "mahesh", 20000);


        System.out.println("Valentine :-" +valentine);
        System.out.println("Valentine1 :-" +valentine1);
        System.out.println("Valentine2 :-" +valentine2);
        System.out.println("Valentine3 :-" +valentine3);


    }
}



class Valentine {

    private int id;

    private String name;

    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

/*    Valentine() {
        id = 10;
        name = "sunny";
        salary = 10000;
    }*/


     Valentine(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return " " +
                " id  = " + id +
                " name = " + name + " " +
                " salary = " + salary +" "
                ;
    }
}
