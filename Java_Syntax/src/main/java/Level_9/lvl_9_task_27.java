package Level_9;

/*
Десять котов
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lvl_9_task_27 {
  public static void main(String[] args) {
    Map<String, Cat> map = createMap();
    Set<Cat> set = convertMapToSet(map);
    printCatSet(set);
  }

  public static Map<String, Cat> createMap() {
    //напишите тут ваш код
    Map<String, Cat> map = new HashMap<String, Cat>();
    map.put("Барсик", new Cat("Кот1"));
    map.put("Мурзик", new Cat("Кот2"));
    map.put("Васька", new Cat("Кот3"));
    map.put("Нафаня", new Cat("Кот4"));
    map.put("Евгений", new Cat("Кот5"));
    map.put("Николас", new Cat("Кот6"));
    map.put("Славик", new Cat("Кот7"));
    map.put("Пумба", new Cat("Кот8"));
    map.put("Мурка", new Cat("Кот9"));
    map.put("Дракула", new Cat("Кот10"));

    return map;
  }

  public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
    //напишите тут ваш код
    HashSet<Cat> set = new HashSet<Cat>(map.values());

    return set;
  }

  public static void printCatSet(Set<Cat> set) {
    for (Cat cat : set) {
      System.out.println(cat);
    }
  }

  public static class Cat {
    private String name;

    public Cat(String name) {
      this.name = name;
    }

    public String toString() {
      return "Cat " + this.name;
    }
  }
}
