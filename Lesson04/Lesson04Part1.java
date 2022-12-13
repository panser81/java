public class Lesson04Part1 {

    public static void main(String args[]) {
        for (int y = 2000; y <= 2010; y++) {
            if (isLeapYear(y)) {
                System.out.println(y + " year has 366 days");
            } else {
                System.out.println(y + " year has 365 days");
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 400 != 0;
    }
}