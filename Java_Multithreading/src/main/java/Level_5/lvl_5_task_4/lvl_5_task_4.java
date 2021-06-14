package Level_5.lvl_5_task_4;

/*
Мониторинг состояния нити
*/

public class lvl_5_task_4 {
    public static void main(String[] args) throws InterruptedException {
        Thread target = new Thread();
        LoggingStateThread loggingStateThread = new LoggingStateThread(target);

        loggingStateThread.start(); //NEW
        Thread.sleep(100);
        target.start();  //RUNNABLE
        Thread.sleep(100);
        //TERMINATED
    }
}
