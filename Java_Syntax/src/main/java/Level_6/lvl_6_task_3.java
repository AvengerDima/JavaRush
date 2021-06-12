package Level_6;

/*
По 50 000 объектов Cat и Dog
*/

public class lvl_6_task_3 {
  public static void main(String[] args) {
    // напишите тут ваш код
    for(int i = 1; i <= 50000; i++){
      Cat1 cat = new Cat1();
      Dog1 dog = new Dog1();
    }
  }
}

class Cat1 {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.println("A Cat was destroyed");
  }
}

class Dog1 {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.println("A Dog was destroyed");
  }
}
