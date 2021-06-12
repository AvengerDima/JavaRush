package Level_5;

/*
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_5_task_29 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;

    while(true){
      String s = reader.readLine();
      if(s.equals("сумма")){
        break;
      }
      int a = Integer.parseInt(s);
      sum = sum + a;
    }

    System.out.println(sum);
  }
}
