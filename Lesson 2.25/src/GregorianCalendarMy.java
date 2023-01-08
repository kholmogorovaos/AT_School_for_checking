import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregorianCalendarMy {
    Calendar calendar1 = GregorianCalendar.getInstance();
    public long calculateDifferenceGregorianCalendar(Calendar calendar2) {
        long days = ChronoUnit.DAYS.between(calendar2.toInstant(), calendar1.toInstant());
        return days;
    }
}