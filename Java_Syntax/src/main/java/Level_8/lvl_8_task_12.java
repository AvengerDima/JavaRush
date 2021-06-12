package Level_8;

/*
Cамая длинная последовательность
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_8_task_12 {
  public static void main(String[] args) throws IOException {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();
    int count = 1, result = 1;

    for (int i = 0; i < 10; i++){
      int n = Integer.parseInt(reader.readLine());
      list.add(n);
    }

    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i + 1).equals(list.get(i))) {
        count++;
        if (result < count) result = count;

      } else count = 1;
    }
    System.out.println(result);
  }
}
