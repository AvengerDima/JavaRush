package Level_7;

/*
CountDownLatch
*/

import java.util.concurrent.CountDownLatch;

public class lvl_7_task_11 {
    CountDownLatch latch = new CountDownLatch(1);

    public void someMethod() throws InterruptedException {
        latch.await();
        retrieveValue();
        latch.countDown();
    }

    void retrieveValue() {
        System.out.println("Value retrieved.");
    }

    public static void main(String[] args) throws InterruptedException {
    }
}
