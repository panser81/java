package com.gmail.panser81.lesson10;

import java.util.Scanner;

public class CollectionExample {
    public static void main(String[] args) {

        System.out.println("Please select one of examples:");
        System.out.println("1. Sort (by default)");
        System.out.println("2. Replace");
        System.out.println("3. Filter");
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
                    service = new ReplaceExecuteServiceImpl();
                    break;
                case 3:
                    service = new FilterExecuteServiceImpl();
                    break;
                default:
                    service = new SortExecuteServiceImpl();
                    break;
            }
            service.execute();
        }
        scanner.close();
    }
}
