package Level_2;

/*
Лазать, летать и бегать
*/

public class lvl_2_task_26 {
  public static void main(String[] args) {

  }

  public class Cat implements CanRun, CanClimb {
    @Override
    public void run() {

    }

    @Override
    public void climb() {

    }
  }

  public class Dog implements CanRun {
    @Override
    public void run() {

    }
  }

  public class Tiger extends Cat {
  }

  public class Duck implements CanRun, CanFly {
    @Override
    public void run() {

    }

    @Override
    public void fly() {

    }
  }

  public interface CanFly {
    public void fly();
  }

  public interface CanClimb {
    public void climb();
  }

  public interface CanRun {
    public void run();
  }
}
