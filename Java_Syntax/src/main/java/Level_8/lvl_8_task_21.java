package Level_8;

/*
Однофамильцы и тёзки
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_21 {
  public static void main(String[] args) {
    Map<String, String> map = createPeopleList();
    printPeopleList(map);
  }

  public static Map<String, String> createPeopleList() {
    //напишите тут ваш код
    Map<String, String> map = new HashMap<String, String>();
    map.put("Дмитрий", "Колегов");
    map.put("Иван", "Пономарёв");
    map.put("Анастасия", "Дурова");
    map.put("Дмитрий", "Рябко");
    map.put("Анна", "Коломаева");
    map.put("Джон", "Колегов");
    map.put("Валентин", "Дуров");
    map.put("Александр", "Королёв");
    map.put("Василий", "Говоров");
    map.put("Ксения", "Жукова");
    return map;
  }

  public static void printPeopleList(Map<String, String> map) {
    for (Map.Entry<String, String> s : map.entrySet()) {
      System.out.println(s.getKey() + " " + s.getValue());
    }
  }
}
