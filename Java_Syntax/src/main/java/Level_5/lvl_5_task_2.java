package Level_5;

/*
Реализовать метод fight
*/

public class lvl_5_task_2 {
  public int age;
  public int weight;
  public int strength;

  public lvl_5_task_2() {
  }

  public boolean fight(lvl_5_task_2 anotherCat) {

    int ourCatCoefficient = this.strength * 4 + this.weight * 2 - this.age / 2;
    int anotherCatCoefficient = anotherCat.strength * 4 + anotherCat.weight * 2 - anotherCat.age / 2;
    return ourCatCoefficient > anotherCatCoefficient;
  }

  public static void main(String[] args) {

  }
}
