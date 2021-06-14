package Level_6;

/*
Убежденному убеждать других не трудно
*/

import java.util.Comparator;

public class lvl_6_task_3 {
    public static void main(String[] args) {

    }

    public static class CustomizedComparator<T> implements Comparator<T> {
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T o1, T o2) {
            int res = 0;
            for (Comparator<T> comparator : comparators) {
                res = comparator.compare(o1, o2);
                if (res != 0) {
                    return res;
                }
            }

            return 0;
        }
    }
}
