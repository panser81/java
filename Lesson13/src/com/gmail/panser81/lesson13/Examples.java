package com.gmail.panser81.lesson13;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        System.out.println("Please select one of examples:");
        System.out.println("1. Parse file and find min value (by default)");
        System.out.println("2. Create new file");
        System.out.println("3. Read and parse file");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int exampleId = scanner.nextInt();
            ExampleService exampleService;

            if (exampleId == 0) {
                break;
            }

            switch (exampleId) {
                case 2:
                    exampleService = new CreateFileExampleServiceImpl();
                    break;
                case 3:
                    exampleService = new ReadFileExampleServiceImpl();
                    break;
                default:
                    exampleService = new ParseFileExampleServiceImpl();
                    break;
            }
            exampleService.execute();
        }
        scanner.close();
    }
}
