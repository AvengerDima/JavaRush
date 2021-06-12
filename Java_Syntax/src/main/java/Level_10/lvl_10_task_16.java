package Level_10;

/*
Одинаковые слова в списке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lvl_10_task_16 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> words = new ArrayList<String>();
    for (int i = 0; i < 20; i++) {
      words.add(reader.readLine());
    }

    Map<String, Integer> map = countWords(words);

    for (Map.Entry<String, Integer> pair : map.entrySet()) {
      System.out.println(pair.getKey() + " " + pair.getValue());
    }
  }

  public static Map<String, Integer> countWords(ArrayList<String> list) {
    HashMap<String, Integer> result = new HashMap<String, Integer>();

    //напишите тут ваш код
    for (String word : list) {
      result.put(word, result.containsKey(word) ? result.get(word) + 1 : 1);
    }

    return result;
  }
}
