package com.gmail.panser81.lesson12;

public class FirstExampleServiceImpl implements ExampleService {
    @Override
    public void execute() {
        try {
            map(null);
        } catch (NullPointerException exception) {
            System.out.println("throw null pointer exception");
            exception.printStackTrace(System.out);
        }
    }

    private static void map(Car car) {
        car.get();
    }
}
