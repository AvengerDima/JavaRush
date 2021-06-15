package Level_7;

/*
Модификаторы и deadlock
*/

public class lvl_7_task_5 {
    private final String field;

    public lvl_7_task_5(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public synchronized void sout(lvl_7_task_5 solution) {
        System.out.format("111:  %s: %s %n", this.field, solution.getField());
        solution.sout2(this);
    }

    public synchronized void sout2(lvl_7_task_5 solution) {
        System.out.format("222:  %s: %s %n", this.field, solution.getField());
        solution.sout(this);
    }

    public static void main(String[] args) {
        final lvl_7_task_5 solution = new lvl_7_task_5("first");
        final lvl_7_task_5 solution2 = new lvl_7_task_5("second");
        new Thread(new Runnable() {
            public void run() {
                solution.sout(solution2);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                solution2.sout(solution);
            }
        }).start();

    }
}
