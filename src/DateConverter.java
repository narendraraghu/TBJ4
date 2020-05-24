import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateConverter {
//    How to Convert Date to LocalDate in Java 8 - Example Tutorial

    public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static LocalDateTime convertToLocalDateTimeViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static void main(String[] args) {

        Date date = new Date("10/10/2020");
        System.out.println(DateConverter.convertToLocalDateTimeViaInstant(date));
        System.out.println(DateConverter.convertToLocalDateTimeViaMilisecond(date));

    }


}

//2020-10-10T00:00
//2020-10-10T00:00
