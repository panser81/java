package com.gmail.panser81.lesson08;

public class CompanyExample {
    public static void main(String[] args) {
        Employee[] workers = new Employee[10];

        workers[0] = new MonthlyRateEmployee("James", "Smith", "director", "management", 10000);
        workers[1] = new HourlyPaymentEmployee("Michael", "Smith", "accountant", "economic", 50, 80);
        workers[2] = new HourlyPaymentEmployee("Robert", "Smith", "accountant", "economic", 50, 100);
        workers[3] = new VolumeOfSalesEmployee("Maria", "Garcia", "manager", "marketing", 100000, 5);
        workers[4] = new VolumeOfSalesEmployee("David", "Smith", "manager", "marketing", 150000, 5.5);
        workers[5] = new VolumeOfSalesEmployee("Maria", "Smith", "manager", "marketing", 200000, 6);
        workers[6] = new VolumeOfSalesEmployee("Maria", "Hernandez", "manager", "marketing", 70000, 4);
        workers[7] = new CombineSalaryEmployee("Thomas", "Johnson", "manager", "marketing", 2000, 50000, 3);
        workers[8] = new CombineSalaryEmployee("Charles", "Jones", "manager", "marketing", 2000, 80000, 3);
        workers[9] = new CombineSalaryEmployee("George", "Davis", "manager", "marketing", 2000, 70000, 3);
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                workers[i].print();
            }
        }
    }
}
