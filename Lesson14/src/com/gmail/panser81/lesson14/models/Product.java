package com.gmail.panser81.lesson14.models;

public class Product {
    private String name;
    private String uniqueNumber;
    private double price;
    private int count;
    private String production;

    public Product(String name, String uniqueNumber, double price, int count, String production) {
        this.name = name;
        this.uniqueNumber = uniqueNumber;
        this.price = price;
        this.count = count;
        this.production = production;
    }

    public double getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println("Product: " + this.name + ", " + this.uniqueNumber + ", " + this.price + ", " + this.count + ", " + this.production);
    }
}
