package com.gmail.panser81.lesson11;

import java.util.*;

public class HashSetExecuteServiceImpl implements ExecuteService {

    @Override
    public void execute() {
        Map<String, String> customers = new HashMap<>();

        customers.put("q1", "Joan Garza");
        customers.put("q2", "Jeffrey Anderson");
        customers.put("q3", "Teddy Bonilla");
        customers.put("q4", "Habiba Kelley");
        customers.put("q5", "Rafael Rojas");
        customers.put("w1", "Connor Frost");
        customers.put("w2", "Tara Ayala");
        customers.put("w3", "Sabrina Lowe");
        customers.put("w4", "Delores Vaughn");
        customers.put("w5", "Sydney Frank");

        for (String key : customers.keySet()) {
            System.out.println(key);
        }
    }
}
