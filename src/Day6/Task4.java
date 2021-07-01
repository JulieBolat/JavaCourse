package Day6;

public class Task4 {

    public static void main(String[] args) {

        // check whether string "Hello, how are you?" is a question

        //                      Task
        // part1: check whether string "Hi, world!" starts with "Hi"
        // part2: String "Hi world,Hello world" check whether second part of the string starts with Hello

        String question= "Hello, how are you?";
        boolean isQuestion= question.endsWith("?");
        System.out.println(isQuestion);


    }
}
