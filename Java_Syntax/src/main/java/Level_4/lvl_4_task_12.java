package Level_4;

/*
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_12 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(reader.readLine());

    if(number > 0){
      System.out.println(number * 2);
    } else if(number < 0){
      System.out.println(number + 1);
    } else{
      System.out.println(0);
    }
  }
}
