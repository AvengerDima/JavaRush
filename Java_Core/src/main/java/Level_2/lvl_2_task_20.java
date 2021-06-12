package Level_2;

/*
Класс Human и интерфейсы CanRun, CanSwim
*/

public class lvl_2_task_20 {
  public static void main(String[] args) {

  }

  public abstract class Human implements CanRun, CanSwim {

  }

  public interface CanRun {
    void Run();
  }

  public interface CanSwim {
    void Swim();
  }
}
