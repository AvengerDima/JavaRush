package Level_4;

/*
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_27 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(reader.readLine());

    if(n % 2 == 0 && n >= 1 & n < 10){
      System.out.println("четное однозначное число");
    } else if(n % 1 == 0 && n >= 1 & n < 10){
      System.out.println("нечетное однозначное число");
    }else if(n % 2 == 0 && n >= 10 & n < 100){
      System.out.println("четное двузначное число");
    }else if(n % 1 == 0 && n >= 10 & n < 100){
      System.out.println("нечетное двузначное число");
    } else if(n % 2 == 0 && n >= 10 & n < 1000){
      System.out.println("четное трехзначное число");
    } else if(n % 1 == 0 && n >= 10 & n < 1000){
      System.out.println("нечетное трехзначное число");
    } else{

    }
  }
}
