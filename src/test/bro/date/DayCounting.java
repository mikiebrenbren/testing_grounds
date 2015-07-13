package test.bro.date;

import java.util.Calendar;
import java.util.Date;

public class DayCounting {

    public static void main(String[] args) {

        String currentTermCode = "201505";
        String year = currentTermCode.substring(0,4);
        String month = currentTermCode.substring(4, currentTermCode.length());

        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.MONTH, Integer.valueOf(month) + 5);
        calendar.set(Calendar.YEAR, Integer.valueOf(year));
        Long endDateMilli = calendar.getTime().getTime();

        Date date = new Date();
        Long currentDateMilli = date.getTime();

        Long timeLeftMilli = endDateMilli -currentDateMilli;

        int days;
        if (timeLeftMilli > 0) {
            days = (int) (timeLeftMilli / (1000 * 60 * 60 * 24));
        }else {
            days = 0;
        }
        System.out.printf(String.valueOf(days));




    }
}
