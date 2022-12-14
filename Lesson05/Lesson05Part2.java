public class Lesson05Part2 {

    public static void main(String args[]) {
        String[] strArray = {"I see a cat", "I like a coffee", "My sister has a cat", "I like music"};

        int count = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].contains("cat")) {
                System.out.println("The string contains cat: " + strArray[i]);
                System.out.println("Length: " + strArray[i].length());
            } else
                count++;
        }
        System.out.println("Count of not valid strings: " + count);
    }
}