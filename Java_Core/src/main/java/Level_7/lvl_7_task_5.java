package Level_7;

/*
Сад-огород
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_7_task_5 {
  public static void main(String[] args) {

  }

  public static class Garden {

    public final List<String> fruits = new ArrayList<String>();
    public final List<String> vegetables = new ArrayList<String>();

    public synchronized void addFruit(int index, String fruit) {
      fruits.add(index, fruit);
    }

    public synchronized void removeFruit(int index) {
      fruits.remove(index);
    }

    public synchronized void addVegetable(int index, String vegetable) {
      vegetables.add(index, vegetable);
    }

    public synchronized void removeVegetable(int index) {
      vegetables.remove(index);
    }
  }
}
