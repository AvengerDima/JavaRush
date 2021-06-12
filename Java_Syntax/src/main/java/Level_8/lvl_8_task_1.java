package Level_8;

/*
HashSet из растений
*/

import java.util.HashSet;

public class lvl_8_task_1 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    HashSet<String> set = new HashSet<String>();
    set.add("арбуз");
    set.add("банан");
    set.add("вишня");
    set.add("груша");
    set.add("дыня");
    set.add("ежевика");
    set.add("женьшень");
    set.add("земляника");
    set.add("ирис");
    set.add("картофель");

    for (String text : set){
      System.out.println(text);
    }
  }
}
