package Level_7;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lvl_7_task_5 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] largeArr = new int[20];
    int[] smallArr1 = new int[10];
    int[] smallArr2 = new int[10];

    for (int i = 0; i < largeArr.length; i++){
      largeArr[i] = Integer.parseInt(reader.readLine());
    }

    smallArr1 = Arrays.copyOfRange(largeArr, 0, 10);
    smallArr2 = Arrays.copyOfRange(largeArr, 10, 20);
    for (int i = 0; i < smallArr2.length; i++){
      System.out.println(smallArr2[i]);
    }
  }
}
