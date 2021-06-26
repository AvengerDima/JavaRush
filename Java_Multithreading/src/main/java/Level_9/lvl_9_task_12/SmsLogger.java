package Level_9.lvl_9_task_12;

public class SmsLogger extends AbstractLogger {

    public SmsLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Send SMS to CEO: " + message);
    }
}
