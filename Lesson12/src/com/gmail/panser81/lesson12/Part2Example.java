package com.gmail.panser81.lesson12;

import java.util.Scanner;

public class Part2Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int typeErrorId = scanner.nextInt();

            try {
                switch (typeErrorId) {
                    case 1:
                        throw new FirstOwnException("Something was wrong");
                    case 2:
                        throw new SecondException("Example for exception");
                    case 3:
                        throw new ThirdException("Third example for exception");
                }
            } catch (FirstOwnException exception) {
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
