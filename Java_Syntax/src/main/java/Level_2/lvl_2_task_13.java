package Level_2;

/*
Питомцам нужны люди
*/

public class lvl_2_task_13 {
  public static void main(String[] args) {

    Cat cat = new Cat();
    Dog dog = new Dog();
    Fish fish = new Fish();
    Woman woman = new Woman();
    cat.owner = woman;
    dog.owner = woman;
    fish.owner = woman;
  }

  public static class Cat {
    public Woman owner;
  }

  public static class Dog {
    public Woman owner;
  }

  public static class Fish {
    public Woman owner;
  }

  public static class Woman {
  }
}
