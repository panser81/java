package com.gmail.panser81.lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SortExecuteServiceImpl implements ExecuteService {
    private static final int MIN_AGE = 1940;
    private static final int MAX_AGE = 2010;

    @Override
    public void execute() {

        List<Person> persons = new ArrayList<>();

        String[] personsFirstName = new String[]{"Joan", "Ella-Louise", "Gideon", "Morgan", "Inaaya", "Markus", "Solomon", "Bessie", "Jeffrey", "Teddy", "Habiba", "Rafael", "Connor", "Tara", "Sabrina", "Delores", "Sydney", "Amelie", "Nadine", "Emily"};
        String[] personsLastName = new String[]{"Coleman", "Watson", "May", "Carrillo", "Santana", "Williams", "Rogers", "Garza", "Anderson", "Bonilla", "Kelley", "Rojas", "Frost", "Ayala", "Lowe", "Vaughn", "Frank", "Carney", "Tucker", "Best"};

        for (int i = 0; i < 10; i++) {
            Person person = new Person(personsFirstName[i], personsLastName[i], getRandomAge(MIN_AGE, MAX_AGE));
            persons.add(person);
        }

        Comparator<Person> ageComparator = (p1, p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> firstNameComparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> lastNameComparator = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

        List<Person> sortedList = persons.stream()
                .sorted(ageComparator.thenComparing(firstNameComparator).thenComparing(lastNameComparator))
                .collect(Collectors.toList());

        for (Person p : sortedList) {
            System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge());
        }
    }

    private int getRandomAge(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
