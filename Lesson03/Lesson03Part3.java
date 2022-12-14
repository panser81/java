import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson03Part3 {
    public static void main(String args[]) throws IOException {
        System.out.println("Please input a numeric of season: ");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String seasonValue = reader.readLine();

        try {
            int seasonId = Integer.parseInt(seasonValue);

            switch (seasonId) {
                case 1:
                    System.out.println("You selected a winter: " + seasonId);
                    break;
                case 2:
                    System.out.println("You selected a spring: " + seasonId);
                    break;
                case 3:
                    System.out.println("You selected a summer: " + seasonId);
                    break;
                case 4:
                    System.out.println("You selected a autumn: " + seasonId);
                    break;
                default:
                    System.out.println("Please input a corect id. The correct value should be in range 1 .. 4");
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Please input a valid value for a season. The correct value should be in range 1 .. 4");
        }
    }
}