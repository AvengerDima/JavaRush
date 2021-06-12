package Level_7;

/*
Самая длинная строка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class lvl_7_task_8 {
  private static List<String> strings;

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    strings = new ArrayList<String>();
    int max = 0;

    for(int i = 0; i < 5; i++){
      strings.add(reader.readLine());
      if(strings.get(i).length() > max){
        max = strings.get(i).length();
      }
    }

    for(int i = 0; i < strings.size(); i++){
      if(max == strings.get(i).length()){
        System.out.println(strings.get(i));
      }

    }
  }
}
