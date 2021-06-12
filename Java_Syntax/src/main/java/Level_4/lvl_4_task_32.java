package Level_4;

/*
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_32 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String text = reader.readLine();
    int n = Integer.parseInt(reader.readLine());

    while(n > 0){
      System.out.println(text);
      n--;
    }
  }
}
