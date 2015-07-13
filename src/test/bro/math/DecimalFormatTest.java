package test.bro.math;

import java.text.DecimalFormat;

/**
 * Created by michael.brennan on 6/23/15.
 */
public class DecimalFormatTest {

    public static void main(String[] args) {
        double i = 0.2;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println(decimalFormat.format(i));
    }
}
