package Level_7.lvl_7_task_10;

public class Person implements Runnable {
    private final Mail mail;

    public Person(Mail mail) {
        this.mail = mail;
    }

    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(1000);
            //сделайте что-то тут - do something here
            synchronized (mail) {
                mail.setText("Person [" + name + "] wrote an email 'AAA'");
                //сделайте что-то тут - do something here
                mail.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
