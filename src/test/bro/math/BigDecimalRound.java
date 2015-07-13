package test.bro.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by michael.brennan on 6/22/15.
 */
public class BigDecimalRound {

    public static void main(String[] args) {
        System.out.println("BigDecimalRound.main");
        BigDecimal bigDecimal1 = new BigDecimal(24.323423423).setScale(0, RoundingMode.HALF_UP);
        BigDecimal bigDecimal2 = new BigDecimal(6.2).setScale(0, RoundingMode.HALF_UP);

//        BigDecimal sum = bigDecimal1.add(bigDecimal2).setScale(0, RoundingMode.HALF_UP);
        BigDecimal sum = bigDecimal1.divide(bigDecimal2);
        System.out.println(sum);
    }
}
