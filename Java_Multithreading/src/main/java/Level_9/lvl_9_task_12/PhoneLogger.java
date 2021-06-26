package Level_9.lvl_9_task_12;

public class PhoneLogger extends AbstractLogger {
    public PhoneLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Call to director: " + message);
    }
}
