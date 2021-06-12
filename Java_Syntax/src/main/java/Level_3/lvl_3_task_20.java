package Level_3;

/*
Скромность украшает программиста
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_3_task_20 {
  public static void main(String[] args) throws Exception {

    BufferedReader salary = new BufferedReader(new InputStreamReader(System.in));

    String name = salary.readLine();

    System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
  }
}
