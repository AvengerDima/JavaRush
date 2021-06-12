package Level_4;

/*
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_18 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());

    if(a < b){
      System.out.println(a);
    } else if(b < a){
      System.out.println(b);
    } else if(a == b){
      System.out.println(a);
    } else{
      System.out.println("Ошибка");
    }
  }
}
