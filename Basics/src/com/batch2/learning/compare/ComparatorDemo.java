package com.batch2.learning.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person(1, "Sunny", 34000), new Person(2, "Girish", 60000), new Person(3, "Suresh", 164000), new Person(4, "Suresh", 64000));

        System.out.println("Before Sorting employees:\n" + personList);

        Collections.sort(personList, new NameAndSalaryComparator());

        System.out.println("Before Sorting employees:\n" + personList);
    }
}

class Person {
    private int id;
    private String name;
    private double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
