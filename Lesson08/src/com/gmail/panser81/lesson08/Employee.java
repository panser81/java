package com.gmail.panser81.lesson08;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String department;

    public Employee(String firstName, String lastName, String jobTitle, String department) {
        this.department = department;
        this.firstName = firstName;
        this.jobTitle = jobTitle;
        this.lastName = lastName;
    }

    public abstract double getSalary();

    public void print() {
        String result = "Name: ";
        result = result.concat(this.firstName);
        result = result.concat(" ");
        result = result.concat(this.lastName);
        result = result.concat(", Job title: ");
        result = result.concat(this.jobTitle);
        result = result.concat(", Department: ");
        result = result.concat(this.department);
        result = result.concat(", Salary: ");
        result = result.concat(String.valueOf(this.getSalary()));
        System.out.println(result);
    }
}
