package Level_7;

/*
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_9 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> list = new ArrayList<String>();
    int min = 20;

    for(int i = 0; i < 5; i++){ //считываем с клавиатуры 5 строк и добавляем в список
      list.add(reader.readLine());
      if(list.get(i).length() < min){ //находим самую короткую строку в списке
        min = list.get(i).length();
      }
    }

    for(int i = 0; i < list.size(); i++){ //выводим содержимое списка
      if(min == list.get(i).length()){
        System.out.println(list.get(i));
      }
    }
  }
}
