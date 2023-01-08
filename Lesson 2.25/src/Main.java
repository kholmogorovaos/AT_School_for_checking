import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Date myBirthDay = new Date(84,1,13, 8, 19,0);
        System.out.println("Задание 1:");
        System.out.println(new SimpleDateFormat("dd-MMMM-yyyy").format(myBirthDay));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(myBirthDay));
        System.out.println(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").format(myBirthDay));
        System.out.println(new SimpleDateFormat("dd MMMM yyyy zzzz").format(myBirthDay));
        System.out.println(new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z").format(myBirthDay) + "\n");
        long start1 = System.currentTimeMillis();
        LocalDate myBirthDay1 = LocalDate.of(1984,02,13);
        System.out.println("LocalDate: " + myBirthDay1);
        long start2 = System.currentTimeMillis();
        LocalDateTime myBirthDay2 = LocalDateTime.of(1984,2,13,8,19);
        System.out.println("LocalDateTime: " + myBirthDay2);
        long start3 = System.currentTimeMillis();
        ZoneId rusZoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime myBirthDay3 = ZonedDateTime.of(1984,2,13,8,19,00,00,rusZoneId);
        System.out.println("ZonedDateTime: " + myBirthDay3);
        long start4 = System.currentTimeMillis();
        GregorianCalendar myBirthDay4 = new GregorianCalendar(1984,01,13,8,19,00);
        System.out.println("GregorianCalendar: " + myBirthDay4.getTime() + "\n");
 //Задание 2
        System.out.println("Задание 2:");
        DateMy newMyBirthDay = new DateMy();
        System.out.println("Разница между датами Date: " + newMyBirthDay.calculateDifferenceDays(myBirthDay) + " дней");
        LocalDateMy newMyBirthDay1 = new LocalDateMy();
        System.out.println("Разница между датами LocalDate: " + newMyBirthDay1.calculateDifferenceLocalDate(myBirthDay1) + " дней");
        LocalDateTimeMy newMyBirthDay2 = new LocalDateTimeMy();
        System.out.println("Разница между датами LocalDateTime: " + newMyBirthDay2.calculateDifferenceLocalDateTime(myBirthDay2) + " дней");
        ZonedDateTimeMy newMyBirthDay3 = new ZonedDateTimeMy();
        System.out.println("Разница между датами ZonedDateTime: " + newMyBirthDay3.calculateDifferenceZonedDateTime(myBirthDay3) + " дней");
        GregorianCalendarMy newMyBirthDay4 = new GregorianCalendarMy();
        System.out.println("Разница между датами GregorianCalendar: " + newMyBirthDay4.calculateDifferenceGregorianCalendar(myBirthDay4) + " дней" + "\n");
  //Задание 3
        System.out.println("Задание 3:");
        long timeWork = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWork + " миллисекунд" + "\n");
  //Задание 4
        System.out.println("Задание 4:");
        System.out.println("Скорость выполнения программы Date: " + timeWork + " миллисекунд");
        long timeWork1 = System.currentTimeMillis() - start1;
        System.out.println("Скорость выполнения программы LocalDate: " + timeWork1 + " миллисекунд");
        long timeWork2 = System.currentTimeMillis() - start2;
        System.out.println("Скорость выполнения программы LocalDateTime: " + timeWork2 + " миллисекунд");
        long timeWork3 = System.currentTimeMillis() - start3;
        System.out.println("Скорость выполнения программы ZonedDateTime: " + timeWork3 + " миллисекунд");
        long timeWork4 = System.currentTimeMillis() - start4;
        System.out.println("Скорость выполнения программы GregorianCalendar: " + timeWork4 + " миллисекунд");
    }
}
