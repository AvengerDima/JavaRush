package Level_7.lvl_7_task_9;

/*
Producer–consumer
*/

public class lvl_7_task_9 {
    public static void main(String[] args) throws InterruptedException {
        TransferObject transferObject = new TransferObject();
        ProducerTask producerTask = new ProducerTask(transferObject);
        ConsumerTask consumerTask = new ConsumerTask(transferObject);

        Thread.sleep(50);
        producerTask.stop();
        consumerTask.stop();
    }
}
