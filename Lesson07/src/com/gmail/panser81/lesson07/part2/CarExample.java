package com.gmail.panser81.lesson07.part2;

public class CarExample {
    public static void main(String[] args) {
        Automobile russianCar = new RussianAutomobile();
        System.out.println(russianCar.getDescription());

        Automobile germanyCar = new GermanyAutomobile();
        System.out.println(germanyCar.getDescription());

        Automobile englandCar = new EnglandAutomobile();
        System.out.println(englandCar.getDescription());
    }
}
