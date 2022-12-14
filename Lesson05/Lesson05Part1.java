public class Lesson05Part1 {

    public static void main(String args[]) {
        String mainStr = "The main string for Lesson 01. Need to find a last character";

        int mainStrLen = mainStr.length();

        char[] mainStrArray = mainStr.toCharArray();

        char lastCharacter = mainStrArray[mainStrLen - 1];

        System.out.println("The last character is " + lastCharacter);

        for (int i = 0; i < mainStrLen; i++) {
            if (mainStrArray[i] == lastCharacter) {
                System.out.println("Position is " + i);
            }
        }
    }
}