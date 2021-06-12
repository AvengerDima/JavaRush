package Level_2;

/*
Создаем человека
*/

public class lvl_2_task_19 {
  public static void main(String[] args) {

  }

  public interface CanFly {
    public void fly();
  }

  public interface CanRun {
    public void run();
  }

  public interface CanSwim {
    public void swim();
  }


  public class Human implements CanRun, CanSwim {
    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
  }

  public class Duck implements CanFly, CanRun, CanSwim {
    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
  }

  public class Penguin implements CanRun, CanSwim {
    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
  }

  public class Airplane implements CanFly, CanRun {
    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }
  }
}
