package Level_8;

/*
Минимальное из N чисел
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class lvl_8_task_22 {
  public static void main(String[] args) throws Exception {
    List<Integer> integerList = getIntegerList();
    System.out.println(getMinimum(integerList));
  }

  public static int getMinimum(List<Integer> array) {
    // Найти минимум тут
    int min = array.get(0);
    for (int i = 0; i < array.size(); i++){
      if (array.get(i) < min){
        min = array.get(i);
      }
    }
    return min;
  }

  public static List<Integer> getIntegerList() throws IOException {
    // Создать и заполнить список тут
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> list = new ArrayList<Integer>();
    int N = Integer.parseInt(reader.readLine());
    for (int i = 0; i < N; i++){
      list.add(Integer.parseInt(reader.readLine()));
    }
    return list;
  }
}
