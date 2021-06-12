package Level_3;

/*
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class lvl_3_task_26 {
  public static void main(String[] args) throws IOException {
    // напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String fileName = reader.readLine();

    reader = new BufferedReader(new InputStreamReader((new FileInputStream(fileName))));

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    while (reader.ready()){
      int num = Integer.parseInt(reader.readLine());
      if (num % 2 == 0) {
        numbers.add(num);
      }
    }
    reader.close();

    Collections.sort(numbers);

    for (int i : numbers) {
      System.out.println(i);
    }
  }
}
