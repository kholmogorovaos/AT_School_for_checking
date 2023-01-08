import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
public class ZonedDateTimeMy {
    LocalDateTime ldt = LocalDateTime.now();
    ZonedDateTime now2 = ldt.atZone(ZoneId.of("Europe/Paris"));
    public long calculateDifferenceZonedDateTime(ZonedDateTime zonedDT) {
        long days = ChronoUnit.DAYS.between(zonedDT, now2);
        return days;
    }
}
