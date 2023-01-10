package com.gmail.panser81.lesson15.models;

public class Student {
    private String firstName;
    private String lastName;
    private int entryYear;

    public Student(String firstName, String lastName, int entryYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.entryYear = entryYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getEntryYear() {
        return this.entryYear;
    }

    public void print() {
        System.out.format("%s %s %s\n", this.firstName, this.lastName, this.entryYear);
    }
}
