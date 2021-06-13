package Level_1;

/*
Ошибка в equals/hashCode
*/

import java.util.Date;
import java.util.Objects;

public class lvl_1_task_6 {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private lvl_1_task_6 solution;

    public lvl_1_task_6(int anInt, String string, double aDouble, Date date, lvl_1_task_6 solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        lvl_1_task_6 solution1 = (lvl_1_task_6) o;
        return anInt == solution1.anInt &&
                Double.compare(solution1.aDouble, aDouble) == 0 &&
                Objects.equals(string, solution1.string) &&
                Objects.equals(date, solution1.date) &&
                Objects.equals(solution, solution1.solution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anInt, string, aDouble, date, solution);
    }

    public static void main(String[] args) {

    }
}
