package Level_5;

/*
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_5_task_7 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double sum = 0;
    //int count = 0;

    while (true){
      int n = Integer.parseInt(reader.readLine());
      if(n == -1){
        break;
      }
      sum = sum + n;
      //count++;
      sum = sum / n;
    }
    //System.out.println(sum / count);
    System.out.println(sum);
  }
}
