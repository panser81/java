package com.gmail.panser81.lesson07.part1;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        setName(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateSquare() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.width + 2 * this.height;
    }
}
