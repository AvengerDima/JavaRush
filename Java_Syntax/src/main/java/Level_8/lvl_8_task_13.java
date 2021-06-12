package Level_8;

/*
20 слов на букву «Л»
*/

import java.util.HashSet;
import java.util.Set;

public class lvl_8_task_13 {
  public static Set<String> createSet() {
    //напишите тут ваш код
    Set<String> set = new HashSet<String>();

    for (int i = 0; i < 20; i++){
      set.add("Л" + i);
    }

    return set;
  }

  public static void main(String[] args) {

  }
}
