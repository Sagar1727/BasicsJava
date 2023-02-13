package com.batch2.learning.compare;

import java.util.Comparator;

public class NameAndSalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getName().compareTo(person2.getName()) != 0) {
            return person1.getName().compareTo(person2.getName());
        } else if (person1.getName().compareTo(person2.getName()) == 0) {
            if (person1.getSalary() == person2.getSalary()) {
                return 0;
            } else if (person1.getSalary() > person2.getSalary()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
