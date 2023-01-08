import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class LocalDateMy {
    LocalDate date2 = LocalDate.now();
    public long calculateDifferenceLocalDate(LocalDate date) {
        long days = ChronoUnit.DAYS.between(date, date2);
        return days;
    }
}
