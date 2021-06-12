package Level_4;

/*
Фейс-контроль
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_23 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();
    int age = Integer.parseInt(reader.readLine());

    if(age > 20){
      System.out.println("И 18-ти достаточно");
    } else{

    }
  }
}
