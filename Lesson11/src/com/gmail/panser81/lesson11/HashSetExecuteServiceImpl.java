package com.gmail.panser81.lesson11;

import java.util.*;

public class HashSetExecuteServiceImpl implements ExecuteService {

    @Override
    public void execute() {
        Map<String, String> customers = new HashMap<>();

        String[] personsName = new String[]{"Joan Coleman", "Ella-Louise Watson", "Gideon Morgan", "Morgan Inaaya", "Solomon Bessie", "Markus Watson", "Solomon Jeffrey", "Bessie Habiba", "Jeffrey Connor", "Teddy Rafael"};

        for (int i = 0; i < 5; i++) {
            int keyPrefix = i + 1;
            customers.put("q" + keyPrefix, personsName[i]);
            customers.put("w" + keyPrefix, personsName[i + 5]);
        }

        for (String key : customers.keySet()) {
            System.out.println(key);
        }
    }
}
