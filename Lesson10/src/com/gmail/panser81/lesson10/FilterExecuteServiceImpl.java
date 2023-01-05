package com.gmail.panser81.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FilterExecuteServiceImpl implements ExecuteService {

    private int minValue = 15;
    private int maxValue = 30;

    @Override
    public void execute() {
        List<Person> persons = new ArrayList<>();

        String[] personsFirstName = new String[]{"Joan", "Ella-Louise", "Gideon", "Morgan", "Inaaya", "Markus", "Solomon", "Bessie", "Jeffrey", "Teddy", "Habiba", "Rafael", "Connor", "Tara", "Sabrina", "Delores", "Sydney", "Amelie", "Nadine", "Emily"};
        String[] personsLastName = new String[]{"Coleman", "Watson", "May", "Carrillo", "Santana", "Williams", "Rogers", "Garza", "Anderson", "Bonilla", "Kelley", "Rojas", "Frost", "Ayala", "Lowe", "Vaughn", "Frank", "Carney", "Tucker", "Best"};

        for (int i = 0; i < 20; i++) {
            Person person = new Person(personsFirstName[i], personsLastName[i], getRandomAge(minValue, maxValue));
            persons.add(person);
        }

        List<Person> infants = persons.stream().filter(person -> person.getAge() < 18).collect(Collectors.toList());
        List<Person> adults = persons.stream().filter(person -> person.getAge() >= 18).collect(Collectors.toList());

        for (Person person : infants) {
            System.out.println("Infant: " + getPersonDetail(person));
        }

        for (Person person : adults) {
            System.out.println("Adult: " + getPersonDetail(person));
        }
    }

    private int getRandomAge(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt((maxValue - minValue) + 1) + minValue;
    }

    private String getPersonDetail(Person person) {
        return person.getName() + " " + person.getSurName() + " " + person.getAge();
    }
}
