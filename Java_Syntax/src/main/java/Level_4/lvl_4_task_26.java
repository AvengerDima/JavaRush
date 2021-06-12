package Level_4;

/*
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_26 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(reader.readLine());

    if(n < 0 && n % 2 == 0){
      System.out.println("отрицательное четное число");
    } else if(n > 0 && n % 2 == 0){
      System.out.println("положительное четное число");
    } else if(n == 0){
      System.out.println("ноль");
    } else if(n < 0 && n % 1 == 0){
      System.out.println("отрицательное нечетное число");
    } else{
      System.out.println("положительное нечетное число");
    }
  }
}
