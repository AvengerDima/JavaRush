package Level_7;

/*
Это конец
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_22 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();

    while (true){
      String s = reader.readLine();
      list.add(s);
      if(s.equals("end")){
        list.remove(s);
        break;
      } else{

      }
    }

    for (int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
