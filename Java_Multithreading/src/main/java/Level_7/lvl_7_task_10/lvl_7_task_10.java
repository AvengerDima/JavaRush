package Level_7.lvl_7_task_10;

/*
Расставь wait-notify
*/

public class lvl_7_task_10 {
    public static void main(String[] args) {
        Mail mail = new Mail();
        Thread server = new Thread(new MailServer(mail));
        Thread amigo = new Thread(new Person(mail));

        server.start();
        amigo.start();
    }
}
