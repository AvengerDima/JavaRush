package Level_8;

/*
Коллекция HashMap из котов
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_3 {
  public static void main(String[] args) throws Exception {
    String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

    HashMap<String, Cat> map = addCatsToMap(cats);

    for (Map.Entry<String, Cat> pair : map.entrySet()) {
      System.out.println(pair.getKey() + " - " + pair.getValue());
    }
  }


  public static HashMap<String, Cat> addCatsToMap(String[] cats) {
    //напишите тут ваш код
    HashMap<String, Cat> map1 = new HashMap<String, Cat>();

    for(String text: cats){
      map1.put(text, new Cat(text));
    }
    return map1;
  }


  public static class Cat {
    String name;

    public Cat(String name) {

      this.name = name;
    }

    @Override
    public String toString() {

      return name != null ? name.toUpperCase() : null;
    }
  }
}
