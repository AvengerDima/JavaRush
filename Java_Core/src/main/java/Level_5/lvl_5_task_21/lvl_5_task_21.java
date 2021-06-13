package Level_5.lvl_5_task_21;

/*
ООП. Перегрузка
*/

import java.math.BigDecimal;

public class lvl_5_task_21 {
  public static void main(String[] args) {
    //Блок 2.
    //Вызов для Object
    new Tree().info((Object)new Integer("4"));
    new Tree().info((Object)new Short("4"));
    new Tree().info((Object)new BigDecimal("4"));

    //Блок 3.
    //Вызов для Number
    new Tree().info(new Integer("4"));
    new Tree().info(new Short("4"));
    new Tree().info(new BigDecimal("4"));

    //Блок 4.
    //Вызов для String
    new Tree().info(new String("4"));
    new Tree().info(new Integer("4").toString());
    new Tree().info(new Short("4").toString());
    new Tree().info(new BigDecimal("4").toString());
  }
}
