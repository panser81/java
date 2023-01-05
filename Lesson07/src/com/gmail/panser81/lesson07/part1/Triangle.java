package com.gmail.panser81.lesson07.part1;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        setName(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateSquare() {
        double p = (this.a + this.b + this.c) / 2;

        double s = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));

        return s;
    }

    @Override
    public double calculatePerimeter() {
        return this.a + this.b + this.c;
    }
}
