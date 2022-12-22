package com.gmail.panser81.lesson09.part1;

public class EnumExample {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s.getDescription() + " has " + s.getCountOfDays() + " days");
        }

        printNextSeason(Season.WINTER);
        printNextSeason(Season.AUTUMN);

        printCountOfDays(Season.AUTUMN);
    }

    public static void printNextSeason(Season season) {
        System.out.println("Next season is " + GetNextSeason(season).getDescription());
    }

    public static void printCountOfDays(Season season) {
        System.out.println(season.getDescription() + " has " + season.getCountOfDays() + " days");
    }

    private static Season GetNextSeason(Season season) {
        Season result = season;

        switch (season) {
            case WINTER:
                result = Season.SPRING;
                break;
            case SPRING:
                result = Season.SUMMER;
                break;
            case SUMMER:
                result = Season.AUTUMN;
                break;
            case AUTUMN:
                result = Season.WINTER;
                break;
        }
        return result;
    }
}
