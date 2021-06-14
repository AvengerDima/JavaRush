package Level_5;

/*
Поживем - увидим
*/

public class lvl_5_task_10 extends Thread {
    public lvl_5_task_10() {
        this.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                String message;
                if (e instanceof Error) {
                    message = "Нельзя дальше работать";
                } else if (e instanceof Exception) {
                    message = "Надо обработать";
                } else {
                    message = "Поживем - увидим";
                }
                System.out.println(message);
            }
        });
    }

    public static void main(String[] args) {
    }
}
