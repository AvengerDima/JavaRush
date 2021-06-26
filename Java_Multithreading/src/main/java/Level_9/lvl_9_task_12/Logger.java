package Level_9.lvl_9_task_12;

public interface Logger {
    void inform(String message, int level);

    void setNext(Logger next);

    void info(String message);
}
