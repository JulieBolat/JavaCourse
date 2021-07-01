package Day35_DateTimeFormatter_Jun2;

import java.time.LocalDateTime;

public class Task1 {

    /*
    LocalDateTime now = LocalDateTime.now();
     1- 5 days ago
     2- 2 hours later
     3- 3 weeks plus, 4 hours minus, 50 minutes plus
     */

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime minus5Days = now.minusDays(5);
        LocalDateTime plus2Hours = now.plusHours(2);
        LocalDateTime combined = now.plusWeeks(3).minusHours(4).plusMinutes(50);

    }
}
