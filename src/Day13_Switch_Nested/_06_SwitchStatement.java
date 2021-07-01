package Day13_Switch_Nested;

public class _06_SwitchStatement {

    public static void main(String[] args) {

        int number = 1;

        switch (number){ // the switch statement will only check for equality of cases below
            case 1: // if number == 1
                System.out.println("The number is 1");
                break; // after printing it will go out of this switch
            case 2: // else if number == 2
                System.out.println("The number is 2");
                break;
            case 3: // else if number == 3
                System.out.println("The number is 3");
                break;
            default: // else
                System.out.println("The number is not found");
        }

//        if (number == 1){
//            System.out.println("The number is 1");
//        } else if (number == 2) {
//            System.out.println("The number is 2");
//        } else if (number == 3){
//            System.out.println("The number is 3");
//        } else {
//            System.out.println("The number is not found");
//        }


    }
}
