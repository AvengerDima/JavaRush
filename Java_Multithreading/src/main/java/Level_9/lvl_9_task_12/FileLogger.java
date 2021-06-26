package Level_9.lvl_9_task_12;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to file: " + message);
    }
}
