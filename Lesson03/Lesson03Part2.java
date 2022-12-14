import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson03Part2 {
    public static void main(String args[]) throws IOException {
        System.out.println("Please input year: ");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String yearString = reader.readLine();

        try {
            int year = Integer.parseInt(yearString);

            if (year % 4 == 0 && year % 400 != 0) {
                System.out.println("Leap year: " + yearString);
                return;
            }
            System.out.println("Not leap year: " + yearString);
        } catch (Exception ex) {
            System.out.println("Please input a valid value for the year");
        }

        System.out.println(yearString);
    }
}