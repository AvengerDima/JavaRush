package Level_7.lvl_7_task_10;

public class MailServer implements Runnable {
    private Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        //сделайте что-то тут - do something here
        try {
            synchronized (mail) {
                mail.wait();
            }
            String name = Thread.currentThread().getName();
            long endTime = System.currentTimeMillis();
            System.out.format("%s MailServer received: [%s] in %d ms after start", name, mail.getText(), (endTime - startTime));
        } catch (InterruptedException ignored) {

        }

    }
}
