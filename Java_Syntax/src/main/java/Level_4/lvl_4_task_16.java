package Level_4;

/*
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_16 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double t1 = Double.parseDouble(reader.readLine());
    double t = t1 % 5;
    if(t >= 0 & t < 3){
      System.out.println("зелёный");
    } else if(t < 4){
      System.out.println("жёлтый");
    } else if(t < 5){
      System.out.println("красный");
    } else{
      System.out.println("Ошибка");
    }
  }
}
