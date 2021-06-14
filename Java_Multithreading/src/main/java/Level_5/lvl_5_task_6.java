package Level_5;

/*
Без дураков
*/

public class lvl_5_task_6 {
    public static void main(String[] args) {
        MyThread myThread = new lvl_5_task_6().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                }
                System.out.println(String.format("%s, %s, %s", MyThread.this.secretKey, t.getName(), e.getMessage()));
            }
        }
    }
}
