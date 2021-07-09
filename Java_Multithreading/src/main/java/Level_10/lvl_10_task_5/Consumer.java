package Level_10.lvl_10_task_5;

import java.util.concurrent.TransferQueue;

public class Consumer implements Runnable {
    private TransferQueue<ShareItem> queue;

    public Consumer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(450);
            while (true) {
                ShareItem shareItem = queue.take();
                System.out.format("Processing %s\n", shareItem.toString());
            }
        } catch (InterruptedException e) {

        }
    }
}
