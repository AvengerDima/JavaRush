package Level_7;

/*
Массивный максимум
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_7_task_1 {
  public static void main(String[] args) throws Exception {
    int[] array = initializeArray();
    int max = max(array);
    System.out.println(max);
  }

  public static int[] initializeArray() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = new int[20];

    for(int i = 0; i < numbers.length; i++){
      numbers[i] = Integer.parseInt(reader.readLine());
    }
    return numbers;
  }
  public static int max(int[] array) {
    int max = array[0];
    for(int i = 0; i < 20; i++){
      if(array[i] > max){
        max = array[i];
      }
    }
    return max;
  }
}
