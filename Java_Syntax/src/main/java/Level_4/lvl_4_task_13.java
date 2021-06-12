package Level_4;

/*
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_13 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int week = Integer.parseInt(reader.readLine());

    if(week == 1){
      System.out.println("понедельник");
    } else if(week == 2){
      System.out.println("вторник");
    } else if(week == 3){
      System.out.println("среда");
    } else if(week == 4){
      System.out.println("четверг");
    } else if(week == 5){
      System.out.println("пятница");
    } else if(week == 6){
      System.out.println("суббота");
    } else if(week == 7){
      System.out.println("воскресенье");
    } else{
      System.out.println("такого дня недели не существует");
    }
  }
}
