package com.gmail.panser81.lesson09.part2;

public class GarageExample {
    public static void main(String[] args) {
        Garage<Vehicle> firstGarage = new Garage<Vehicle>();
        Car car = new Car("mersedes");
        firstGarage.set(car);
        System.out.println("First garage: " + firstGarage.get().getName());

        Garage<Vehicle> secondGarage = new Garage<Vehicle>();
        MotorCycle motorCycle = new MotorCycle("bmw");
        secondGarage.set(motorCycle);
        System.out.println("Second garage: " + secondGarage.get().getName());
    }
}
