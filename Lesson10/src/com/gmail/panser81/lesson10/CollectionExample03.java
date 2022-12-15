package com.gmail.panser81.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionExample03 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        int min = 15;
        int max = 30;

        list.add(new Person("Joan", "Garza", getRandomAge(min, max)));
        list.add(new Person("Jeffrey", "Anderson", getRandomAge(min, max)));
        list.add(new Person("Teddy", "Bonilla", getRandomAge(min, max)));
        list.add(new Person("Habiba", "Kelley", getRandomAge(min, max)));
        list.add(new Person("Rafael", "Rojas", getRandomAge(min, max)));
        list.add(new Person("Connor", "Frost", getRandomAge(min, max)));
        list.add(new Person("Tara", "Ayala", getRandomAge(min, max)));
        list.add(new Person("Sabrina", "Lowe", getRandomAge(min, max)));
        list.add(new Person("Delores", "Vaughn", getRandomAge(min, max)));
        list.add(new Person("Sydney", "Frank", getRandomAge(min, max)));
        list.add(new Person("Amelie", "Carney", getRandomAge(min, max)));
        list.add(new Person("Nadine", "Tucker", getRandomAge(min, max)));
        list.add(new Person("Emily", "Best", getRandomAge(min, max)));
        list.add(new Person("Ella-Louise", "Coleman", getRandomAge(min, max)));
        list.add(new Person("Gideon", "Watson", getRandomAge(min, max)));
        list.add(new Person("Morgan", "May", getRandomAge(min, max)));
        list.add(new Person("Inaaya", "Carrillo", getRandomAge(min, max)));
        list.add(new Person("Markus", "Santana", getRandomAge(min, max)));
        list.add(new Person("Bessie", "Williams", getRandomAge(min, max)));
        list.add(new Person("Solomon", "Rogers", getRandomAge(min, max)));

        for (Person p : list) {
            if (p.getAge() < 18)
                System.out.println("Infant: " + getPersonDetail(p));
            else
                System.out.println("Adult: " + getPersonDetail(p));
        }
    }

    private static int getRandomAge(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt((maxValue - minValue) + 1) + minValue;
    }

    private static String getPersonDetail(Person person) {
        return person.getName() + " " + person.getSurName() + " " + person.getAge();
    }
}
