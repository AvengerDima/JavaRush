package Level_9;

/*
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_9_task_23 {
  public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    char[] chArr = reader.readLine().toCharArray();

    ArrayList<Character> listVow = new ArrayList<Character>();
    ArrayList<Character> listNVow = new ArrayList<Character>();

    for (int i = 0; i < chArr.length; i++) {
      if (isVowel(chArr[i])) {
        listVow.add(chArr[i]);
      } else if (chArr[i] == ' ') {
        continue;
      } else {
        listNVow.add(chArr[i]);
      }
    }

    for (char c : listVow) {
      System.out.print(c + " ");
    }
    System.out.println();

    for (char c : listNVow) {
      System.out.print(c + " ");
    }
  }

  // метод проверяет, гласная ли буква
  public static boolean isVowel(char c) {
    c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

    for (char d : vowels)   // ищем среди массива гласных
    {
      if (c == d)
        return true;
    }
    return false;
  }
}
