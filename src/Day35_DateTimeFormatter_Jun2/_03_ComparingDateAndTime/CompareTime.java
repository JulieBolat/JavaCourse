package Day35_DateTimeFormatter_Jun2._03_ComparingDateAndTime;

import java.time.LocalTime;

public class CompareTime {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime twoMinutesInFuture = now.plusMinutes(2);

        boolean isEqual = now.equals(twoMinutesInFuture); // false
        boolean isAfter = now.isAfter(twoMinutesInFuture); // false
        boolean isBefore = now.isBefore(twoMinutesInFuture); // true

        System.out.println(isEqual);
        System.out.println(isAfter);
        System.out.println(isBefore);


//        now.isLeapYear();  we don't have this method - no year info in LocalTime

    }

}