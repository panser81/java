public class Lesson05Part3 {

    public static void main(String args[]) {
        String mainStr = "To the question Where? - From a camel! To the question Why? - Then! To the question What? - Shapito circus! To the question How? - You got tetanus!";
        System.out.println("Init string: " + mainStr);

        int firstPosition = mainStr.indexOf("?", 0) + 1;
        int secondPosition = mainStr.indexOf("?", firstPosition) + 1;
        int thirdPosition = mainStr.indexOf("?", secondPosition);

        String result = mainStr.substring(0, secondPosition);
        String innerStr = mainStr.substring(secondPosition, thirdPosition).replace(" ", "");
        result = result.concat(innerStr).concat(mainStr.substring(thirdPosition));

        System.out.println("Result string: " + result);
    }
}