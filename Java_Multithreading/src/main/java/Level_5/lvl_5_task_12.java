package Level_5;

/*
Живем своим умом
*/

import java.util.LinkedList;
import java.util.List;

public class lvl_5_task_12 implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();

        List<String> res = new LinkedList<>();
        while (e != null) {
            res.add(0, e.toString());
            e = e.getCause();
        }

        for (String s : res) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

    }
}
