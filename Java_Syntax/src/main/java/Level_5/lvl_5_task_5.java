package Level_5;

/*
Кошачья бойня
*/

public class lvl_5_task_5 {
  public static void main(String[] args) {

    Cat catVaska = new Cat("Vaska", 4, 5, 5);
    Cat catBarsik = new Cat("Barsik", 5, 6, 7);
    Cat catMursik = new Cat("Mursik", 2, 3, 2);

    if(catVaska.fight(catBarsik)){
      System.out.println(catBarsik);
    } else{
      System.out.println(catVaska);
    }

    if(catBarsik.fight(catMursik)){
      System.out.println(catBarsik);
    } else{
      System.out.println(catMursik);
    }

    if(catMursik.fight(catVaska)){
      System.out.println(catVaska);
    } else{
      System.out.println(catMursik);
    }
  }

  public static class Cat {
    protected String name;
    protected int age;
    protected int weight;
    protected int strength;

    public Cat(String name, int age, int weight, int strength) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
      int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
      int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
      int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

      int score = ageAdvantage + weightAdvantage + strengthAdvantage;
      return score > 2; // return score > 2 ? true : false;
    }
  }
}
