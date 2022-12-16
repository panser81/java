package com.gmail.panser81.lesson11.part2;

import java.util.HashMap;

public class HashSetExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("q1", "Joan Garza");
        hashMap.put("q2", "Jeffrey Anderson");
        hashMap.put("q3", "Teddy Bonilla");
        hashMap.put("q4", "Habiba Kelley");
        hashMap.put("q5", "Rafael Rojas");
        hashMap.put("w1", "Connor Frost");
        hashMap.put("w2", "Tara Ayala");
        hashMap.put("w3", "Sabrina Lowe");
        hashMap.put("w4", "Delores Vaughn");
        hashMap.put("w5", "Sydney Frank");

        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }
}
