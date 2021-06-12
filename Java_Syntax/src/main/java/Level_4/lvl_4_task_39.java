package Level_4;

/*
Письмо счастья
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_39 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();

    for(int n = 0; n < 10; n++){
      System.out.println(name + " любит меня.");
    }
  }
}
