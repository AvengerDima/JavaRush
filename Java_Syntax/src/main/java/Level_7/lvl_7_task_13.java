package Level_7;

/*
Играем в Jолушку
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class lvl_7_task_13 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i = 0; i < 20; i++){ //заполнение списка
      int numbers = Integer.parseInt(reader.readLine());
      list.add(numbers);
    }

    ArrayList<Integer> list_x3 = new ArrayList<Integer>();
    ArrayList<Integer> list_x2 = new ArrayList<Integer>();
    ArrayList<Integer> list_x = new ArrayList<Integer>();

    for(int i = 0; i < list.size(); i++){
      Integer x = list.get(i);
      if(x % 3 == 0 && x % 2 == 0){
        list_x3.add(x);
        list_x2.add(x);
      } else if(x % 3 == 0){
        list_x3.add(x);
      } else if(x % 2 == 0){
        list_x2.add(x);
      } else {
        list_x.add(x);
      }
    }

    printList(list);
    printList(list_x3);
    printList(list_x2);
    printList(list_x);
  }

  public static void printList(List<Integer> list) {
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
