package com.gmail.panser81.lesson14;

public class Person {
    private String name;
    private String surName;
    private int year;

    public Person(String name, String surName, int year) {
        this.name = name;
        this.surName = surName;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    public int getYear() {
        return this.year;
    }
}
