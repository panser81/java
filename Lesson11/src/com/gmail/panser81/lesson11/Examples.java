package com.gmail.panser81.lesson11;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        System.out.println("Please select one of examples:");
        System.out.println("1. Frequency (by default)");
        System.out.println("2. HashSet");
        System.out.println("3. Sort");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int exampleId = scanner.nextInt();
            ExecuteService service;

            if (exampleId == 0) {
                break;
            }

            switch (exampleId) {
                case 2:
                    service = new HashSetExecuteServiceImpl();
                    break;
                case 3:
                    service = new SortExecuteServiceImpl();
                    break;
                default:
                    service = new FrequencyExecuteServiceImpl();
                    break;
            }
            service.execute();
        }
        scanner.close();
    }
}
