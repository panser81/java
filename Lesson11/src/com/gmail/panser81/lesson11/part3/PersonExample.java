package com.gmail.panser81.lesson11.part3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("Joan", "Garza", 1973));
        list.add(new Person("Jeffrey", "Anderson", 1945));
        list.add(new Person("Teddy", "Bonilla", 2018));
        list.add(new Person("Habiba", "Kelley", 2000));
        list.add(new Person("Rafael", "Rojas", 2001));
        list.add(new Person("Connor", "Frost", 2000));
        list.add(new Person("Tara", "Ayala", 2003));
        list.add(new Person("Sabrina", "Lowe", 2005));
        list.add(new Person("Delores", "Vaughn", 1990));
        list.add(new Person("Sydney", "Frank", 1995));

        Comparator<Person> ageComparator = (p1, p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> firstNameComparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> lastNameComparator = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

        List<Person> sortedList = list.stream()
                .sorted(ageComparator.thenComparing(firstNameComparator).thenComparing(lastNameComparator))
                .collect(Collectors.toList());

        for (Person p : sortedList)
            System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge());
    }
}
