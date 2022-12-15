package com.gmail.panser81.lesson06;

public class Lesson06 {
    public static void main(String[] args) {
        CreditCard creditCard01 = new CreditCard();
        creditCard01.setAccountNumber("000000001");
        creditCard01.setTotalSum(100);

        CreditCard creditCard02 = new CreditCard();
        creditCard02.setAccountNumber("000000002");
        creditCard02.setTotalSum(150);

        CreditCard creditCard03 = new CreditCard();
        creditCard03.setAccountNumber("000000003");
        creditCard03.setTotalSum(200);

        creditCard01.addMoney(10);
        creditCard02.addMoney(15);
        creditCard03.takeMoney(15);

        creditCard01.print();
        creditCard02.print();
        creditCard03.print();
    }
}
