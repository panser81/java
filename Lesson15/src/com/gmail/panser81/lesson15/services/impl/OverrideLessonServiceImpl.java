package com.gmail.panser81.lesson15.services.impl;

import com.gmail.panser81.lesson15.models.Student;
import com.gmail.panser81.lesson15.services.LessonService;

public class OverrideLessonServiceImpl implements LessonService {
    @Override
    public void execute() throws Exception {

        Student firstStudent = new Student("FirstName1", "LastName1", 2010);

        Student secondStudent = new Student("FirstName2", "LastName2", 2000) {
            @Override
            public void print() {
                System.out.format("%s %s %s\n", getEntryYear(), getLastName(), getFirstName());
            }
        };

        firstStudent.print();
        secondStudent.print();
    }
}
