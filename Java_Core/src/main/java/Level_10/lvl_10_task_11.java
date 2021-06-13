package Level_10;

/*
Serializable Solution
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class lvl_10_task_11 {
    public static void main(String[] args) {
        System.out.println(new lvl_10_task_11(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public lvl_10_task_11(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
