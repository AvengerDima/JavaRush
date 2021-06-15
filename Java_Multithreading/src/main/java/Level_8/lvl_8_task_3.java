package Level_8;

/*
ThreadLocalRandom
*/

import java.util.concurrent.ThreadLocalRandom;

public class lvl_8_task_3 {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to + 1);
    }

    public static double getRandomDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    public static long getRandomLongBetween0AndN(long n) {
        return ThreadLocalRandom.current().nextLong(n + 1);
    }

    public static void main(String[] args) {
    }
}
