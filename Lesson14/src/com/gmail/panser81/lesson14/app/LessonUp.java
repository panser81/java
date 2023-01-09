package com.gmail.panser81.lesson14.app;

import com.gmail.panser81.lesson14.services.LessonService;
import com.gmail.panser81.lesson14.services.impl.*;

import java.util.Scanner;

public class LessonUp {
    public static void main(String[] args) {
        System.out.println("Please select one of examples:");
        System.out.println("1. Create directories (by default)");
        System.out.println("2. Serialize list of Products");
        System.out.println("3. Deserialize list of Products");
        System.out.println("4. Print a product which has a min price");
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
                        lessonService = new DeserializeLessonServiceImpl();
                        break;
                    case 4:
                        lessonService = new ProcessLessonServiceImpl();
                        break;
                    default:
                        lessonService = new CreateDirectoriesLessonServiceImpl();
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
