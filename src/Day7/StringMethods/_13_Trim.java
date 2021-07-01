package Day7.StringMethods;

public class _13_Trim {
    public static void main(String[] args) {

        String welcomeMessage= "     Hello TechnoStudy"; //reduce the spaces before and end of the word
        System.out.println(welcomeMessage);

        String trimmedString= welcomeMessage.trim();
        System.out.println(trimmedString);
    }
}
