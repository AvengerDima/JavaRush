package Level_2.lvl_2_task_3;

/*
Строки нитей или строковые нити? Вот в чем вопрос
*/

public class lvl_2_task_3 extends Thread {
    public static void main(String[] args) {
        new lvl_2_task_3();
    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public lvl_2_task_3() {
        initThreads();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());

        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
    }

    public synchronized String getPartOfString(String string, String threadName) {
        try {
            return string.substring(string.indexOf("\t") + 1, string.lastIndexOf("\t"));
        } catch (StringIndexOutOfBoundsException e) {
            if (threadName.equals(FIRST_THREAD_NAME)) {
                throw new StringForFirstThreadTooShortException();
            } else if (threadName.equals(SECOND_THREAD_NAME)) {
                throw new StringForSecondThreadTooShortException();
            } else {
                RuntimeException re = new RuntimeException();
                re.initCause(new StringIndexOutOfBoundsException("String index out of range: -1"));
                throw re;
            }
        }
    }
}
