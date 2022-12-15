package com.gmail.panser81.lesson07.part1;

public class Circle extends Figure {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(String name, double radius) {
        setName(name);
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return this.radius * this.radius * PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.radius * PI;
    }
}
