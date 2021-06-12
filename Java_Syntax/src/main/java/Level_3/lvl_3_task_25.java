package Level_3;

/*
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_3_task_25 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String salary = reader.readLine();

    System.out.println("Я буду зарабатывать $" + salary + " в час" );
  }
}
