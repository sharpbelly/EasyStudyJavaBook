package chapter08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q6 {
    public static void main(String[] args) {
        Date d = new Date();
        Calendar c = Calendar.getInstance();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
        System.out.println(sdf1.format(d));

        int day = c.get(Calendar.MONTH+1);
        int dayOfMon = c.get(Calendar.DAY_OF_MONTH);

        System.out.printf("오늘은 %d월의 %d번째 날\n",day,dayOfMon);

        int year = c.get(Calendar.YEAR);
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);

        System.out.printf("오늘은 %d년의 %d번째 날",year,dayOfYear);
    }
}
