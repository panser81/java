package com.gmail.panser81.lesson08;

public class VolumeOfSalesEmployee extends Employee {
    private double totalSales;
    private double percent;

    public VolumeOfSalesEmployee(String firstName, String lastName, String jobTitle, String department, double totalSales, double percent) {
        super(firstName, lastName, jobTitle, department);
        this.percent = percent;
        this.totalSales = totalSales;
    }

    @Override
    public double getSalary() {
        return totalSales * percent / 100;
    }
}
