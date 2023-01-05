package com.gmail.panser81.lesson12;

import java.util.Scanner;

public class SecondExampleServiceImpl implements ExampleService {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select one of extensions:");
        System.out.println("1. Generate FirstException (by default)");
        System.out.println("2. Generate SecondException");
        System.out.println("3. Generate ThirdException");
        System.out.println("0. Exit");

        while (true) {
            int typeErrorId = scanner.nextInt();

            if (typeErrorId == 0) {
                break;
            }

            try {
                switch (typeErrorId) {
                    case 1:
                        throw new FirstException("Something was wrong");
                    case 2:
                        throw new SecondException("Example for exception");
                    case 3:
                        throw new ThirdException("Third example for exception");
                }
            } catch (FirstException exception) {
                System.out.println(exception.toString());
            } catch (SecondException exception) {
                System.out.println(exception.toString());
            } catch (ThirdException exception) {
                System.out.println(exception.toString());
            }
            if (typeErrorId == 0) break;
        }
    }
}
