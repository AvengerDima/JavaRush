package Level_4;

/*
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_22 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();
    int age = Integer.parseInt(reader.readLine());

    if(age < 18){
      System.out.println("Подрасти еще");
    } else {

    }
  }
}
