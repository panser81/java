package com.gmail.panser81.lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
            Person person = new Person(personsFirstName[i], personsLastName[i], Helper.getRandomNumber(MIN_AGE, MAX_AGE));
            persons.add(person);
        }

        Comparator<Person> ageComparator = (person1, person2) -> person1.getAge() - person2.getAge();
        Comparator<Person> firstNameComparator = (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName());
        Comparator<Person> lastNameComparator = (person1, person2) -> person1.getLastName().compareTo(person2.getLastName());

        List<Person> sortedList = persons.stream()
                .sorted(ageComparator.thenComparing(firstNameComparator).thenComparing(lastNameComparator))
                .collect(Collectors.toList());

        for (Person person : sortedList) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
        }
    }
}
