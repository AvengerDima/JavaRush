package Level_7;

/*
Меняем функциональность
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_27 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> list = new ArrayList<String>();
    while (true) {
      String s = reader.readLine();
      if (s.isEmpty()) break;
      list.add(s);
    }

    ArrayList<String> list1 = new ArrayList<String>();
    for (String s : list){
      if(s.length() % 2 == 0){
        System.out.println(s + " " + s);
      } else {
        System.out.println(s + " " + s + " " + s);
      }
    }

    for (int i = 0; i < list1.size(); i++){
      System.out.println(list.get(i));
    }

//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
//        }
//
//        for (int i = 0; i < listUpperCase.size(); i++) {
//            System.out.println(listUpperCase.get(i));
//        }
  }
}
