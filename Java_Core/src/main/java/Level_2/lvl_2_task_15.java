package Level_2;

/*
Кошки не должны быть абстрактными!
*/

public class lvl_2_task_15 {
  public static void main(String[] args) {

  }

  public static abstract class Pet {
    public abstract String getName();

    public abstract Pet getChild();
  }

  public static class Cat extends Pet {
    @Override
    public String getName() {
      return "Мурка";
    }

    @Override
    public Pet getChild() {
      return null;
    }
  }

  public static class Dog extends Pet{
    @Override
    public String getName() {
      return "Бобик";
    }

    @Override
    public Pet getChild() {
      return null;
    }
  }
}
