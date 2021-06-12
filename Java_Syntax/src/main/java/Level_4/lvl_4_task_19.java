package Level_4;

/*
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_19 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
    int d = Integer.parseInt(reader.readLine());

    if(a >= b && a >= c && a >= d){
      System.out.println(a);
    } else if(b >= a && b >= c && b >= d){
      System.out.println(b);
    } else if(c >= a && c >= b && c >= d){
      System.out.println(c);
    } else{
      System.out.println(d);
    }
  }
}
