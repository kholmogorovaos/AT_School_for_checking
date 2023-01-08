import java.util.Date;
public class DateMy {
Date nowDate = new Date();
    public int calculateDifferenceDays(Date myBirthdayDate) {
        long difference = nowDate.getTime() - myBirthdayDate.getTime();
        int days = (int) (difference / (24 * 60 * 60 * 1000));
        return days;
    }
}
