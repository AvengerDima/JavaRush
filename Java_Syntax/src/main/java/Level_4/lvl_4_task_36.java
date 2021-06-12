package Level_4;

/*
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_36 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int m = Integer.parseInt(reader.readLine());
    int n = Integer.parseInt(reader.readLine());

    for(; m > 0; m--)
    {
      for(int a = n; a > 0; a--)
      {
        System.out.print(8);
      }
      System.out.println();
    }
  }
}
