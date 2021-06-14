package Level_6;

/*
Почитать в инете про медиану выборки
*/

import java.util.Arrays;
import java.util.Comparator;

public class lvl_6_task_1 {
    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        final double mediana = getMediana(array);

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double v1 = o1.intValue() - mediana;
                double v2 = o2.intValue() - mediana;
                return (int) ((v1 * v1 - v2 * v2) * 100);
            }
        });

        return array;
    }

    private static double getMediana(Integer[] array) {
        Arrays.sort(array);
        double res;
        int length = array.length;

        if (length % 2 == 1) {
            res = array[length / 2];
        } else {
            res = (array[length / 2 - 1] + array[length / 2]) / 2.;
        }
        return res;
    }
}
