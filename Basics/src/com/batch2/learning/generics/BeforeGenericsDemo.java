package com.batch2.learning.generics;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeforeGenericsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        list.add("suresh");
        list.add("Mahesh");
        list.add("Sunny");

        String element2 = list.get(2);


        System.out.println(list);
    }
}
