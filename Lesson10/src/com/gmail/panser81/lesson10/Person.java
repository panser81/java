package com.gmail.panser81.lesson10;

public class Person {
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    public int getAge() {
        return this.age;
    }
}
