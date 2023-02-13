package com.batch2.learning.samples.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Sunny", 34000);
        Employee employee1 = new Employee(2, "Girish", 60000);
        Employee employee2 = new Employee(3, "Suresh", 20000);
        /*System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());*/
/*        String str = "Java 8";
        System.out.println(str);*/

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}

class Employee {
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

    Employee() {
        id = 1;
        name = "Sunny";
        salary = 34000;
    }

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println("THis is show method");
    }

    @Override
    public String toString() {
        return "Employee: \n" + "id=" + id + "\nname=" + name + "\nsalary=" + salary;
    }
}


//Main purpose of Constructor is : to initialize the object

//Properties of Constructor:
//It has the same name as class name
//It is like a method but it does not have return type
