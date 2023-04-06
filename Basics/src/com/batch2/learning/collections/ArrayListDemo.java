package com.batch2.learning.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        int[] arr = {1, 2, 3};

        for (int ele : arr) {
            System.out.println(ele);
        }

        int[] arr2 = new int[10];
        arr2[1] = 10;
        arr2[2] = 10;
        arr2[3] = 10;
        arr2[4] = 10;
        arr2[5] = 10;

        arr[2] = 10;

        System.out.println(arr[1]);

       /* Set<String> stringSet = new HashSet<>();
        System.out.println(stringList);
        stringSet.add("Sunny");
        stringSet.add("Girish");
        stringSet.add("Sagar");
        stringSet.add("Praven");
        stringSet.add("Mahesh");
        stringSet.add("Mahesh");

        System.out.println(stringSet);*/

        System.out.println(stringList);

        stringList.add("Sunny");
        stringList.add("Girish");
        stringList.add("Sagar");
        stringList.add("Praven");
        stringList.add("Mahesh");
        stringList.add("Mahesh");

        stringList.remove(5);

        System.out.println(stringList.size());

        for (String element : stringList) {
            System.out.println(element + " Batch - 2");
        }


        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i) + " Batch - 2");
        }

        stringList.forEach(System.out::println);
    }
}
