package Day13_Switch_Nested;

import java.util.Scanner;

public class _07_SwitchTask2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String currentDay = scanner.nextLine();


        switch (currentDay){
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day");
        }



    }
}
