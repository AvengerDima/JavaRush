package Level_8;

/*
ShutdownNow!
*/

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class lvl_8_task_8 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            final int localId = i;
            executor.submit(new Runnable() {
                public void run() {
                    doExpensiveOperation(localId);
                }
            });
        }

        List<Runnable> incomplete = executor.shutdownNow();
        Thread.sleep(100);
        for (Runnable r: incomplete) {
            System.out.println(r.toString() + " was not completed");
        }
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}
