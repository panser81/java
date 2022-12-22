package com.gmail.panser81.lesson08;

public class HourlyPaymentEmployee extends Employee {
    private double hourlyRate;
    private double hours;

    public HourlyPaymentEmployee(String firstName, String lastName, String jobTitle, String department, double hourlyRate, double hours) {
        super(firstName, lastName, jobTitle, department);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return this.hourlyRate * this.hours;
    }
}
