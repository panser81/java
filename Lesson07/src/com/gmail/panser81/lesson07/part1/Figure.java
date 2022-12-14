package com.gmail.panser81.lesson07.part1;

public class Figure {
    private String name;
    private double square;
    private double perimeter;

    public void setName(String name) {
        this.name = name;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public void calculateSquare() {

    }

    public void calculatePerimeter() {

    }

    public void print() {
        System.out.println("Figure: " + this.name);
        System.out.println("square: " + this.square);
        System.out.println("perimeter: " + this.perimeter);
    }
}
