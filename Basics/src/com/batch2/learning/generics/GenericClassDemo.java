package com.batch2.learning.generics;

import java.util.List;

public class GenericClassDemo<T> {

    T object;
    GenericClassDemo(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

}

class MultipleTypesGenericDemo<T, U> {
    T tObj;
    U uObj;

    MultipleTypesGenericDemo(T tObj, U uObj){
        this.tObj = tObj;
        this.uObj = uObj;
    }

    public void print() {
        System.out.println(this.tObj);
        System.out.println(this.uObj);
    }
}

class Test {
    public static void main(String[] args) {
       /* GenericClassDemo<Integer> iObj = new GenericClassDemo<>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        GenericClassDemo<String> sObj = new GenericClassDemo<>("GeeksForGeeks");
        System.out.println(sObj.getObject());

        GenericClassDemo<Sunny> sunnyObj = new GenericClassDemo<>(new Sunny(1, "Sunny", 45678.90));
        System.out.println(sunnyObj.getObject());*/

        MultipleTypesGenericDemo<String, String> stringStringMultipleTypesGenericDemo = new MultipleTypesGenericDemo<>("Mahesh", "Sunny");

        stringStringMultipleTypesGenericDemo.print();
    }
}

class Sunny {
    int id;
    String name;
    double salary;

    public Sunny(int id, String name, double salary) {
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
        return "Sunny{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
