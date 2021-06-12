package Level_5;

/*
Том и Джерри
*/

public class lvl_5_task_27 {
  public static void main(String[] args) {
    Mouse jerryMouse = new Mouse("Jerry", 12, 5);

    Dog spikeDog = new Dog("Spike", 50, 2);
    Cat tomCat = new Cat("Tom", 30, 10);
  }

  public static class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
      this.name = name;
      this.height = height;
      this.tail = tail;
    }
  }

  public static class Dog{
    String name;
    int height;
    int tail;

    public Dog(String name, int height, int tail){
      this.name = name;
      this.height = height;
      this.tail = tail;
    }
  }

  public static class Cat{
    String name;
    int height;
    int tail;

    public Cat(String name, int height, int tail){
      this.name = name;
      this.height = height;
      this.tail = tail;
    }
  }
}
