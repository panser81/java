package com.gmail.panser81.lesson16.app;

import com.gmail.panser81.lesson16.services.LessonService;
import com.gmail.panser81.lesson16.services.impl.*;

import java.util.Scanner;

public class LessonUp {
    public static void main(String[] args) {
        System.out.println("Please select one of examples:");
        System.out.println("1. Get max value (by default)");
        System.out.println("2. Create file");
        System.out.println("3. Use synchronized");
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
                        lessonService = new CreateFileLessonServiceImpl();
                        break;
                    case 3:
                        lessonService = new SyncMethodLessonServiceImpl();
                        break;
                    default:
                        lessonService = new MaxValueLessonServiceImpl();
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
