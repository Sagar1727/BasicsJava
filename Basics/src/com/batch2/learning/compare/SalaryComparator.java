package com.batch2.learning.compare;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getSalary() == person2.getSalary()) {
            return 0;
        } else if (person1.getSalary() > person2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}
