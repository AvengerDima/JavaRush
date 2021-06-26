package Level_9.lvl_9_task_12;

/*
Рефакторинг паттерна Chain of Responsibility
*/

public class lvl_9_task_12 {
    public static void main(String[] args) {
        Logger logger3 = new PhoneLogger(Level.FATAL);
        Logger logger2 = new SmsLogger(Level.ERROR);
        Logger logger1 = new ConsoleLogger(Level.WARN);
        Logger logger0 = new FileLogger(Level.INFO);

        logger3.setNext(logger2);
        logger2.setNext(logger1);
        logger1.setNext(logger0);

        logger3.inform("Everything is OK", Level.INFO);
        logger3.inform("We found a bug", Level.WARN);
        logger3.inform("Database connection error", Level.ERROR);
        logger3.inform("System shut down", Level.FATAL);
    }
}
