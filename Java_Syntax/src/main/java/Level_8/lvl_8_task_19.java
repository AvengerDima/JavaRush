package Level_8;

/*
Set из котов
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lvl_8_task_19 {
  public static void main(String[] args) {
    Set<Cat> cats = createCats();

    //напишите тут ваш код. step 3 - пункт 3
    Iterator<Cat> iterator = cats.iterator();
    iterator.next();
    iterator.remove();
    printCats(cats);
  }

  public static Set<Cat> createCats() {
    //напишите тут ваш код. step 2 - пункт 2
    HashSet<Cat> set = new HashSet<Cat>();
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    set.add(cat1);
    set.add(cat2);
    set.add(cat3);
    return set;
  }

  public static void printCats(Set<Cat> cats) {
    // step 4 - пункт 4
    for (Cat cat : cats){
      System.out.println(cat);
    }
  }

  // step 1 - пункт 1
  public static class Cat {

  }
}
