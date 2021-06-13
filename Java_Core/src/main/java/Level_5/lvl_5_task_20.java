package Level_5;

/*
Тренировка мозга
*/

public class lvl_5_task_20 {
  public static void main(String[] args) {
    Duck duck = new Duck();
    Util.fly(duck);
    Util.move(duck);
  }

  public static class Duck implements CanFly, CanMove {
    @Override
    public void doAction() {
      System.out.println("Flying");
    }

    @Override
    public void doAnotherAction() {
      System.out.println("Moving");
    }
  }

  public static class Util {
    static void fly(CanFly animal) {
      animal.doAction();
    }

    static void move(CanMove animal) {
      animal.doAnotherAction();
    }
  }

  public static interface CanFly {
    void doAction();
  }

  public static interface CanMove {
    void doAnotherAction();
  }
}
