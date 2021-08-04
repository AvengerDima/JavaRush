package Level_9;

/*
Этот странный BigDecimal
*/

import java.math.BigDecimal;

public class lvl_9_task_8 {
    public static void main(String[] args) {
        System.out.println(getValue(1.1d, 1.2d));
    }

    public static BigDecimal getValue(double v1, double v2) {
        return new BigDecimal(String.valueOf(v1)).add(new BigDecimal(String.valueOf(v2)));
    }
}
