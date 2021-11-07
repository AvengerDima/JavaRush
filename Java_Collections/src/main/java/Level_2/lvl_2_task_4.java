package Level_2;

/*
Пишем стек-трейс
*/

import java.io.PrintWriter;
import java.io.StringWriter;

public class lvl_2_task_4 {
    public static void main(String[] args) {
        String text = getStackTrace(new IndexOutOfBoundsException("fff"));
        System.out.println(text);
    }

    public static String getStackTrace(Throwable throwable) {
        StringWriter writer = new StringWriter();
        throwable.printStackTrace(new PrintWriter(writer));
        return writer.toString();
    }
}
