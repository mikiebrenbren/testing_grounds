package test.bro.date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by michael.brennan on 7/13/15.
 */
public class EpochTime {


    public static void main(String[] args) {
        Date date= new java.util.Date();
        long mili  = new Timestamp(date.getTime()).getTime();
        System.out.println(mili);

        Date newDate = new Date(mili);
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(formattedDate);
    }
}
