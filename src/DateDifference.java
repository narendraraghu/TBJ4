import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, Month.MAY, 12);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthday, today);
        int years = age.getYears();

        System.out.println(years);
    }
}
