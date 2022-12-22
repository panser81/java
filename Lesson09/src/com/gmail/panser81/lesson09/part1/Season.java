package com.gmail.panser81.lesson09.part1;

public enum Season {
    WINTER("Winter", 90),
    SPRING("Spring", 92),
    SUMMER("Summer", 92),
    AUTUMN("Autumn", 91);

    private final String description;
    private final int countOfDays;

    Season(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCountOfDays() {
        return this.countOfDays;
    }
}
