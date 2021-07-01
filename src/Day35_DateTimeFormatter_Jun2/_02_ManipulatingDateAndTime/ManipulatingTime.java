package Day35_DateTimeFormatter_Jun2._02_ManipulatingDateAndTime;

import java.time.LocalTime;

public class ManipulatingTime {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime timeInFuture = currentTime.plusHours(3);
        System.out.println(timeInFuture);

        LocalTime combinedTimeFuture = currentTime.plusHours(5).minusMinutes(10);
        System.out.println(combinedTimeFuture);

        LocalTime timeWithoutSeconds = LocalTime.of(10,30);
        System.out.println(timeWithoutSeconds);

        LocalTime localTime = timeWithoutSeconds.plusHours(3).plusMinutes(13);
        System.out.println(localTime);


    }

}