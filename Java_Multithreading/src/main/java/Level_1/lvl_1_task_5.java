package Level_1;

/*
Исправить ошибку. Сравнение объектов
*/

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class lvl_1_task_5 {
    private final String first, last;

    public lvl_1_task_5(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null && this == null) return false;
        if (o == null || this == null) return true;
        if (o == this) return true;
        if (!(o instanceof lvl_1_task_5)) return false;

        lvl_1_task_5 solution = (lvl_1_task_5) o;
        return Objects.equals(first, solution.first) &&
                Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<lvl_1_task_5> s = new HashSet<>();
        s.add(new lvl_1_task_5("Mickey", "Mouse"));
        System.out.println(s.contains(new lvl_1_task_5("Mickey", "Mouse")));
    }
}
