package Level_7;

/*
Что за список такой?
*/

import java.util.ArrayList;

public class lvl_7_task_7 {
  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    list.add("0");
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");

    int j = list.size();
    System.out.println(j);

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
