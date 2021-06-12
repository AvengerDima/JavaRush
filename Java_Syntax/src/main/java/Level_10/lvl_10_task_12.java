package Level_10;

/*
Количество букв
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_10_task_12 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Алфавит
    String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    char[] abcArray = abc.toCharArray();

    ArrayList<Character> alphabet = new ArrayList<Character>();
    for (int i = 0; i < abcArray.length; i++) {
      alphabet.add(abcArray[i]);
    }

    // Ввод строк
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      String s = reader.readLine();
      list.add(s.toLowerCase());
    }

    // напишите тут ваш код
    int count = 0;
    for (char x : alphabet) {
      for (String s : list) {
        for (char ch : s.toCharArray()) {
          if (x == ch) {
            count++;
          }
        }

      }
      System.out.println(x + " " + count);
      count = 0;
    }
  }
}
