package com.gmail.panser81.lesson15.app;

import com.gmail.panser81.lesson15.services.LessonService;
import com.gmail.panser81.lesson15.services.impl.*;

import java.util.Scanner;

public class LessonUp {
    public static void main(String[] args) {
        System.out.println("Please select one of examples:");
        System.out.println("1. Create and read file, need to calculate count a word test (by default)");
        System.out.println("2. Find all numeric values in text");
        System.out.println("3. Parse log");
        System.out.println("4. Override example");
        System.out.println("0. Exit");

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                int exampleId = scanner.nextInt();
                LessonService lessonService;

                if (exampleId == 0) {
                    break;
                }

                switch (exampleId) {
                    case 2:
                        lessonService = new FindNumericLessonServiceImpl();
                        break;
                    case 3:
                        lessonService = new ParseLogLessonServiceImpl();
                        break;
                    case 4:
                        lessonService = new OverrideLessonServiceImpl();
                        break;
                    default:
                        lessonService = new FrequencyWordLessonServiceImpl();
                        break;
                }
                try {
                    lessonService.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
