package Level_9;

/*
Замена рекурсии
*/

import java.util.Random;

public class lvl_9_task_10 {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        StringBuilder sb = new StringBuilder();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sb.append(i);
                sb.append(" ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                sb.append(i);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}
