package com.gmail.panser81.lesson07.part2;

public class EnglandAutomobile extends Automobile {
    @Override
    public int getRate() {
        return 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "My country - England, Rate the car - " + getRate();
    }
}
