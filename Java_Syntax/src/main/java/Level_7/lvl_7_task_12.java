package Level_7;

/*
Самые-самые
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_12 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> list = new ArrayList<String>();
    int max = 0;
    int min = 0;

    for(int i = 0; i < 10; i++){
      list.add(reader.readLine());
    }

    for(int i = 1; i < list.size(); i++){
      if(list.get(max).length() < list.get(i).length()){
        max = i;
      }
      if(list.get(min).length() > list.get(i).length()){
        min = i;
      }
    }

    if (max < min){
      System.out.println(list.get(max));
    } else{
      System.out.println(list.get(min));
    }
  }
}
