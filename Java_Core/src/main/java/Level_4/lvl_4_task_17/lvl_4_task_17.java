package Level_4.lvl_4_task_17;

/*
Валюты
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_4_task_17 {
  public static void main(String[] args) {
    Person ivan = new Person("Иван");
    for (Money money : ivan.getAllMoney()) {
      System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
    }
  }

  static class Person {
    public String name;

    Person(String name) {
      this.name = name;
      this.allMoney = new ArrayList<Money>();
      //напишите тут ваш код
      allMoney.add(new Hrivna(10));
      allMoney.add(new Ruble(24.79));
      allMoney.add(new USD(0.39));
    }

    private List<Money> allMoney;

    public List<Money> getAllMoney() {
      return allMoney;
    }
  }
}
