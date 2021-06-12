package Level_6;

/*
Исправляем ошибки юности
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_6_task_20 {
  public static int max = 100;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String max = "The max is ";
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    lvl_6_task_20.max = a > b ? a : b;

    System.out.println(max + lvl_6_task_20.max);
  }
}
