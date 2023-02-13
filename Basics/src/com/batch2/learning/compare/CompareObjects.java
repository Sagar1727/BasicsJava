package com.batch2.learning.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareObjects {
    public static void main(String[] args) {
        /*List<String> stringList = new ArrayList<>();
        stringList.add("Sunny");
        stringList.add("Bharath");
        stringList.add("Mahesh");
        stringList.add("Girish");
        stringList.add("Sagar");*/

        /*List<String> stringList = Arrays.asList("Sunny", "Bharath", "Mahesh", "Girish", "Sagar");
        System.out.println("Before:" + stringList);
        Collections.sort(stringList);
        System.out.println("After: " + stringList);*/


        List<Employee> employeeList = Arrays.asList(new Employee(1, "Sunny", 34000), new Employee(2, "Girish", 60000), new Employee(3, "Suresh", 164000), new Employee(4, "Suresh", 64000));

        System.out.println("Before Sorting employees:\n" + employeeList);

        Collections.sort(employeeList);

        System.out.println("Before Sorting employees:\n" + employeeList);


        //Employee employee = new Employee(1, "Girish", 34000);
        //Employee employee1 = new Employee(2, "Sunny", 60000);

        //System.out.println(employee.compareTo(employee1));

    }
}

class Employee implements Comparable<Employee> {
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

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println("THis is show method");
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee employee1) {
        if (this.getName().compareTo(employee1.getName()) != 0) {
            return this.getName().compareTo(employee1.getName());
        } else if (this.getName().compareTo(employee1.getName()) == 0) {
            if (this.getSalary() == employee1.getSalary()) {
                return 0;
            } else if (this.getSalary() > employee1.getSalary()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
