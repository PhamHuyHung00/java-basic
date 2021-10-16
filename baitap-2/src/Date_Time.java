import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Date_Time {
    public static void getDate(){
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate today = LocalDate.of(2021, 10, 16);
        System.out.println("hom nay " +today);

        LocalDate curr = LocalDate.of(2021, Month.OCTOBER, 10);
        System.out.println("su dung enum: " +curr);
        System.out.println("ngay mai: " +today.plusDays(1));
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

    }
    public static void getTime(){
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime hour =LocalTime.of(21, 24,24);
        System.out.println("hahihu" +hour);
    }

    public static void formaterDateTime(){
        LocalDate now = LocalDate.now();
        System.out.println("ngay khi chua dinh dang: " +now);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("da dinh dang : "+now.format(myFormat));

        LocalDateTime toDay = LocalDateTime.now();
        DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("HH/mm, dd/MM/yyyy");
        System.out.println("sau khi danh dang: " +toDay.format(myFormat2));

    }
}
