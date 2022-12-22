package com.gmail.panser81.lesson07.part2;

public class RussianAutomobile extends Automobile {

    @Override
    public int getRate() {
        return 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "My country - Russia, Rate the car - " + getRate();
    }
}
