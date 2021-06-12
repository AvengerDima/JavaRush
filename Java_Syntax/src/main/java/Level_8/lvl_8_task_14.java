package Level_8;

/*
Больше 10? Вы нам не подходите
*/

import java.util.HashSet;
import java.util.Iterator;

public class lvl_8_task_14 {
  public static HashSet<Integer> createSet() {
    // напишите тут ваш код
    HashSet<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < 20; i++){
      set.add(i);
    }

    return set;
  }

  public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
    // напишите тут ваш код
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()){
      if(iterator.next() > 10){
        iterator.remove();
      }
    }
    return set;
  }

  public static void main(String[] args) {

  }
}
