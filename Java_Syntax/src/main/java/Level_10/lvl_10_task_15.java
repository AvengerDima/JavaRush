package Level_10;

/*
Массив списков строк
*/

import java.util.ArrayList;

public class lvl_10_task_15 {
  public static void main(String[] args) {
    ArrayList<String>[] arrayOfStringList = createList();
    printList(arrayOfStringList);
  }

  public static ArrayList<String>[] createList() {
    //напишите тут ваш код
    ArrayList<String>[] list1 = new ArrayList[1];


    ArrayList<String> list = new ArrayList<String>();
    list.add("Мама");
    list.add("Папа");

    list1[0] = list;

    return list1;
  }

  public static void printList(ArrayList<String>[] arrayOfStringList) {
    for (ArrayList<String> list : arrayOfStringList) {
      for (String s : list) {
        System.out.println(s);
      }
    }
  }
}
