package Level_7;

/*
Улицы и дома
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_7_task_6 {
  public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      int[] home = new int[15];
      int evenSum = 0;
      int oddSum = 0;

      for (int i = 0; i < home.length; i++){
        home[i] = Integer.parseInt(reader.readLine());
        //home[i] = i;
      }

      for (int i = 0; i < home.length; i++){
        if(i % 2 == 0){
          evenSum += home[i];
        } else{
          oddSum += home[i];
        }
      }

      if(evenSum > oddSum){
        System.out.println("В домах с четными номерами проживает больше жителей.");
      } else{
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
      }
  }
}
