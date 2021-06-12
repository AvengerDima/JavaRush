package Level_8;

/*
Омовение Рамы
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_8_task_23 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();

    //напишите тут ваш код
    char[] array = s.toCharArray();
    for (int i = 0; i < array.length; i++) {
      if(i == 0 || array[i-1] == ' ' && i < array.length - 1)
        array[i] = Character.toUpperCase(array[i]);
    }
    System.out.println(array);
  }
}
