package com.gmail.panser81.lesson07.part3;

public class EmployeeExample {
    public static void main(String[] args) {
        Employee director = new Director();
        Employee worker = new Worker();
        Employee accountant = new Accountant();

        director.print();
        worker.print();
        accountant.print();
    }
}
