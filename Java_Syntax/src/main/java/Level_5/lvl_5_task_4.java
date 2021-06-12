package Level_5;

/*
Трикотаж
*/

public class lvl_5_task_4 {
  public static void main(String[] args) {

    Cat catVaska = new Cat("Vaska", 3, 5, 6);
    Cat catBarsik = new Cat("Barsik", 5, 7, 4);
    Cat catMursik = new Cat("Mursik", 2, 3, 2);
  }

  public static class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.strength = strength;
    }
  }
}
