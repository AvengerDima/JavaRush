package Level_1;

/*
Equals and HashCode
*/

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class lvl_1_task_4 {
    private final String first, last;

    public lvl_1_task_4(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o.getClass() != this.getClass()) return false;

        lvl_1_task_4 solution = (lvl_1_task_4) o;
        return Objects.equals(first, solution.first) &&
                Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<lvl_1_task_4> s = new HashSet<>();
        s.add(new lvl_1_task_4("Donald", "Duck"));
        System.out.println(s.contains(new lvl_1_task_4("Donald", "Duck")));
    }
}
