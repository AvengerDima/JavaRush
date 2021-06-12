package Level_2;

/*
Корова — тоже животное
*/

public class lvl_2_task_14 {
  public static void main(String[] args) {

  }

  public static abstract class Animal {
    public abstract String getName();
  }

  public static class Cow extends Animal {
    @Override
    public String getName() {
      return "Milka";
    }
  }
}
