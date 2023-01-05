package com.gmail.panser81.lesson08;

public class MonthlyRateEmployee extends Employee {
    private double monthlyRate;

    public MonthlyRateEmployee(String firstName, String lastName, String jobTitle, String department, double monthlyRate) {
        super(firstName, lastName, jobTitle, department);
        this.monthlyRate = monthlyRate;
    }

    @Override
    public double getSalary() {
        return this.monthlyRate;
    }
}
