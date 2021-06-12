package Level_4;

/*
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_14 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int year = Integer.parseInt(reader.readLine());
    int days1 = 365;
    int days2 = 366;

    if(year % 400 == 0){
      //System.out.println("високосный год");
      System.out.println("количество дней в году: " + days2);
    } else if(year % 100 == 0){
      //System.out.println("обычный год");
      System.out.println("количество дней в году: " + days1);
    } else if(year % 4 == 0){
      //System.out.println("високосный год");
      System.out.println("количество дней в году: " + days2);
    } else{
      //System.out.println("обычный год");
      System.out.println("количество дней в году: " + days1);
    }
  }
}
