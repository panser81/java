package com.gmail.panser81.lesson06;

public class CreditCard {
    private String accountNumber;
    private float totalSum;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setTotalSum(float totalSum) {
        this.totalSum = totalSum;
    }

    public float getTotalSum() {
        return this.totalSum;
    }

    public void AddMoney(float sum) {
        this.totalSum += sum;
    }

    public void TakeMoney(float sum) {
        this.totalSum -= sum;
    }

    public void Print() {
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.totalSum);
    }
}