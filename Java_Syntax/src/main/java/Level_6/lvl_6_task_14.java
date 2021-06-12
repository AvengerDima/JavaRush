package Level_6;

/*
Статические коты
*/

import java.util.ArrayList;

public class lvl_6_task_14 {
  public static ArrayList<lvl_6_task_14> cats = new ArrayList<>();

  public lvl_6_task_14() {

  }

  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++){
      cats.add(new lvl_6_task_14());
    }
    printCats();
  }

  public static void printCats() {
    for(lvl_6_task_14 cat : cats){
      System.out.println(cat);
    }
  }
}
