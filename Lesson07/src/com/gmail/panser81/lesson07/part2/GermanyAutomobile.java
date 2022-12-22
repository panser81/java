package com.gmail.panser81.lesson07.part2;

public class GermanyAutomobile extends Automobile {
    @Override
    public int getRate() {
        return 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "My country - Germany, Rate the car - " + getRate();
    }
}
