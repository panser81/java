import java.util.Arrays;

public class Lesson03Part1 {
    public static void main(String args[]) {
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {5, 6, 7, 8};

        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;

        int mergedArrayLength = firstArrayLength + secondArrayLength;

        int[] mergedArray = new int[mergedArrayLength];

        System.arraycopy(firstArray, 0, mergedArray, 0, firstArrayLength);
        System.arraycopy(secondArray, 0, mergedArray, firstArrayLength, secondArrayLength);

        System.out.println(Arrays.toString(mergedArray));
    }
}