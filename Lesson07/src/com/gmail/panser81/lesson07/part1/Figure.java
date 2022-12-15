package com.gmail.panser81.lesson07.part1;

public abstract class Figure {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateSquare();

    public abstract double calculatePerimeter();

    public void print() {
        System.out.println("Figure: " + this.name);
        System.out.println("square: " + this.calculateSquare());
        System.out.println("perimeter: " + this.calculatePerimeter());
    }

}
