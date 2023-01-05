package com.gmail.panser81.lesson08;

public class CombineSalaryEmployee extends Employee {
    private double baseRate;
    private double totalSales;
    private double percent;

    public CombineSalaryEmployee(String firstName, String lastName, String jobTitle, String department, double baseRate, double totalSales, double percent) {
        super(firstName, lastName, jobTitle, department);
        this.baseRate = baseRate;
        this.percent = percent;
        this.totalSales = totalSales;
    }

    @Override
    public double getSalary() {
        return baseRate + totalSales * percent / 100;
    }
}
