package Level_8;

/*
Знакомство с Executors
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class lvl_8_task_6 {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            final int localID = i;
            service.submit(new Runnable() {
                @Override
                public void run() {
                    doExpensiveOperation(localID);
                }
            });
        }

        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);

        /* output example
pool-1-thread-2, localId=2
pool-1-thread-1, localId=1
pool-1-thread-3, localId=3
pool-1-thread-1, localId=7
pool-1-thread-1, localId=9
pool-1-thread-4, localId=4
pool-1-thread-5, localId=5
pool-1-thread-2, localId=6
pool-1-thread-1, localId=10
pool-1-thread-3, localId=8
         */
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}
