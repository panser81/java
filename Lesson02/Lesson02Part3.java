public class Lesson02Part3{
    public static void main(String args[]){
        int a = 1;
        int b = 2;

        System.out.println("Result: " + Calculate(a,b));
    }

    public static int Calculate(int x, int y){
        int result = x * y;
        result += x;
        result += y;
        return result;
    }
}