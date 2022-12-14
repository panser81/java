package com.gmail.panser81.lesson07.part1;

public class FigureExample {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Circle("First circle", 2);
        figures[1] = new Rectangle("First Rectangle", 2, 3);
        figures[2] = new Triangle("First Triangle", 3, 3, 3);
        figures[3] = new Circle("Second circle", 3);
        figures[4] = new Rectangle("Second Rectangle", 1, 5);

        double totalPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            figures[i].calculateSquare();
            figures[i].calculatePerimeter();
            totalPerimeter += figures[i].getPerimeter();
            figures[i].print();
        }

        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
