package Level_7;

/*
Продолжаем мыть раму
*/

import java.util.ArrayList;
import java.util.Collections;

public class lvl_7_task_15 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    ArrayList<String> list = new ArrayList<String>(); //создали список
    Collections.addAll(list, "мама", "именно", "мыла", "именно", "раму", "именно"); //заполнили список

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
