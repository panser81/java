public class Lesson02Part3 {
    public static void main(String args[])
    {
        int a = 1;
        int b = 2;

        System.out.println("Result: " + сalculate(a,b));
    }

    public static int сalculate(int x, int y)
    {
        int result = x * y;
        result += x;
        result += y;
        return result;
    }
}