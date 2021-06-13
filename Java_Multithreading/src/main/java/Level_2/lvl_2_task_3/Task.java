package Level_2.lvl_2_task_3;

public class Task implements Runnable {
    private String initialString;
    private lvl_2_task_3 solution;

    public Task(lvl_2_task_3 solution, String initialString) {
        this.solution = solution;
        this.initialString = initialString;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        String str = this.initialString;
        do {
            System.out.println(name + str);
        } while ((str = solution.getPartOfString(str, name)) != null || !str.isEmpty());
    }
}
