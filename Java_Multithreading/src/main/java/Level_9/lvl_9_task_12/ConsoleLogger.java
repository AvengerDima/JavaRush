package Level_9.lvl_9_task_12;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to console: " + message);
    }
}
