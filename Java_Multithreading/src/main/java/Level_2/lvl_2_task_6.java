package Level_2;

/*
Форматирование даты
*/

import java.util.Date;

public class lvl_2_task_6 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59
    }

    public static String getFormattedString() {
        return "%tm:%td:%ty %tH:%tM:%tS";
    }
}
