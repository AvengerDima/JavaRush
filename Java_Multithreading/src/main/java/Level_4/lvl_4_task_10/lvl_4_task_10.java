package Level_4.lvl_4_task_10;

/*
Рефакторинг, анонимные классы
*/

import java.util.LinkedList;
import java.util.List;

public class lvl_4_task_10 {
    public static List<Iterator> iterators = new LinkedList<>();

    private int countItems;

    public Iterator getIterator(final String name) {
        return new Iterator() {
            {
                countItems++;
                System.out.println(name + " item " + countItems);
            }

            public Iterator next() {
                return getIterator(name);
            }
        };
    }

    public static void main(String[] args) {
        lvl_4_task_10 solution = new lvl_4_task_10();

        Iterator iterator = solution.getIterator("iterator");
        for (int i = 1; i < 5; i++) {
            iterators.add(iterator.next());
        }
    }
}
