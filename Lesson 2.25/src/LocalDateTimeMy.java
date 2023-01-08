import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class LocalDateTimeMy {
    LocalDateTime dateTime2 = LocalDateTime.now();
    public long calculateDifferenceLocalDateTime(LocalDateTime dateTime) {
        long days = ChronoUnit.DAYS.between(dateTime, dateTime2);
        return days;
    }
}
