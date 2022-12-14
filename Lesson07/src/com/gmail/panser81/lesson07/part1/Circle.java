package com.gmail.panser81.lesson07.part1;

public class Circle extends Figure {
    private double radius;
    private static final double PI = 3.1415;

    public Circle(String name, double radius) {
        setName(name);
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        double s = this.radius * this.radius * PI;
        setSquare(s);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * this.radius * PI);
    }
}
