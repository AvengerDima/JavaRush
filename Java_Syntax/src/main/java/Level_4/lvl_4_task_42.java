package Level_4;

/*
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_42 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;

    while(true){
      int number = Integer.parseInt(reader.readLine());
      sum = sum + number;
      if(number == -1){
        break;
      }
    }

    System.out.println(sum);
  }
}
