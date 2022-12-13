public class Lesson02
{
    public static void main(String args[])
    {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Result: " + сalculateArithmeticalMean(a,b,c));
    }

    public static float сalculateArithmeticalMean(int x, int y, int z)
    {
        return (x + y + z)/3;
    }
}