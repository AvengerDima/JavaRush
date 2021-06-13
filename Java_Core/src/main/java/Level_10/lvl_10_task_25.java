package Level_10;

/*
Алгоритмы-числа
*/

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class lvl_10_task_25 {
    private static Set<Long> set = new TreeSet<Long>();
    private static long[][] exponMatrix;

    public static long[] getNumbers(long N) {
        set = new TreeSet<>();
        long[] result;
        int[] digits = null;
        int numLength = (int) Math.log10(N) + 1;
        if (numLength > 0 && N > 0) {
            long source = N;
            digits = new int[numLength];
            for (int i = numLength-1; source > 0 ; i--) {
                long digit = source % 10;
                digits[i] = (int) digit;
                source /= 10;
            }
            exponMatrix = getExpons(digits.length);
            int[][] maxNums = getMaxNums(digits);
            for (int i = 0; i < maxNums.length; i++) {
                generateNums(maxNums[i], N);
            }
        }

        result = new long[set.size()];
        int count = 0;
        for (long number : set) {
            result[count] = number;
            count++;
        }
        return result;
    }

    private static int[][] getMaxNums(int[] digs) {
        int[][] result = new int[digs.length][];
        for (int i = 0; i < digs.length; i++) {
            result[i] = new int[i + 1];
        }
        result[digs.length - 1] = digs;
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = 9;
            }
        }
        return result;
    }

    private static void generateNums(int[] arr, long N) {
        if (arr.length > 1) {
            int last = arr.length - 1;
            while (true) {
                while (arr[last] >= arr[last - 1]) {
                    checkAddToSet(arr, N);
                    if (arr[last] < 1 & arr[0] < 1) break;
                    arr[last]--;
                }
                for (int i = last - 1; i > -1; i--) {
                    if (arr[i] > arr[i + 1]) {
                        arr[i]--;
                        arr[i + 1] = 9;
                    }
                }
                if (arr[last] < 1) break;
            }
        } else {
            for (long i = arr[0]; i > 0; i--) {
                if (i < N) {
                    set.add((long) i);
                }
            }
        }
    }

    private static void checkAddToSet(int[] nums, long N) {
        long expSum = getExponSum(nums);
        int numLength = (int) Math.log10(expSum) + 1;
        int[] digits = null;
        if (numLength > 0 && numLength == nums.length) {
            long source = expSum;
            digits = new int[numLength];
            for (int i = numLength-1; source > 0 ; i--) {
                long digit = source % 10;
                digits[i] = (int) digit;
                source /= 10;
            }
            if (expSum == getExponSum(digits) & expSum < N & expSum > 0) {
                set.add(expSum);
            }
        } else return;
    }

    private static long getExponSum(int[] nums) {
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            result += exponMatrix[num][nums.length];
        }
        return result;
    }

    private static long[][] getExpons(int num) {
        num++;
        long[][] result = new long[10][num];
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < num; j++) {
                result[i][j] = longPow(i, j);
            }
        }
        return result;
    }

    private static long longPow(int num, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }


    public static long mem() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static void main(String[] args) {
        Date start = new Date();
        long before = mem();
        long input = Long.MAX_VALUE;
        long[]result = getNumbers(input);
        long after = mem();
        Date finish = new Date();
        System.out.println("input number = " + input);
        System.out.println("max long = " + Long.MAX_VALUE);
        System.out.println("total found = " + result.length);
        System.out.println("used memory = " + ((after - before) / 1048576) + " Mb");
        System.out.println("running time = " + ((finish.getTime() - start.getTime()) / 1000) + " sec");
    }
}
