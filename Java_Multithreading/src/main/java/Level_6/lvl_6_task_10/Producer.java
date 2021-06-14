package Level_6.lvl_6_task_10;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            int i = 0;
            while (true) {
                queue.put(String.valueOf(i++));
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
