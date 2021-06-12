package Level_5;

/*
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_5_task_32 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    int maximum = 0;

    for (int i = 0; i<n; i++){
      int temp = Integer.parseInt(reader.readLine());
      if (i==0) {
        maximum = temp;
      } else if(temp > maximum){
        maximum = temp;
      } else{

      }
    }
    System.out.println(maximum);
  }
}
