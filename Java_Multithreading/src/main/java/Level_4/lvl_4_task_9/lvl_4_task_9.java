package Level_4.lvl_4_task_9;

/*
Интернет-магазин продажи джинсов
*/

import java.util.List;

public class lvl_4_task_9 {
    public static List<Jeans> allJeans = Util.getAllJeans();

    public static void main(String[] args) {
        for (Jeans jeans : allJeans) {
            System.out.println(jeans);
        }
    }
}
