package Day35_DateTimeFormatter_Jun2._03_ComparingDateAndTime;

import java.time.LocalDateTime;

public class CompareDateAndTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        boolean isEqual = now.isEqual(now2);
        boolean isAfter = now.isAfter(now2);
        boolean isBefore = now.isBefore(now2);

        // depending on your processor speed you might get different result
        System.out.println(isEqual);
        System.out.println(isAfter);
        System.out.println(isBefore);

        boolean isLeapYear = now.toLocalDate().isLeapYear();
        System.out.println(isLeapYear);

    }

}