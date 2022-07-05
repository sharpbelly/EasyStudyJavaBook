package chapter08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
        System.out.println(sdf1.format(d));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        try{
            d = sdf2.parse("2023-07-05");
        } catch (ParseException e){

        }

        System.out.println(sdf1.format(d));

        Calendar calender = Calendar.getInstance();
        SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd", Locale.US);
        System.out.println(sdf3.format(calender.getTime()));

        SimpleDateFormat sdf4 = new SimpleDateFormat("E yyyy.MM.dd",Locale.KOREA);
        System.out.println(sdf4.format(calender.getTime()));

    }
}
