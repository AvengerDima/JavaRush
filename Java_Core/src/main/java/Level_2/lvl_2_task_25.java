package Level_2;

/*
Посетители
*/

public class lvl_2_task_25 {
  public static void main(String[] args) {
    System.out.println(getObjectType(new Cat()));
    System.out.println(getObjectType(new Tiger()));
    System.out.println(getObjectType(new Lion()));
    System.out.println(getObjectType(new Bull()));
    System.out.println(getObjectType(new Cow()));
    System.out.println(getObjectType(new Animal()));
  }

  public static String getObjectType(Object o) {
    return o.toString();
  }

  public static class Cat extends Animal   //<--Классы наследуются!!
  {
    @Override
    public String toString() {
      return "Кот";
    }
  }

  public static class Tiger extends Cat {
    @Override
    public String toString() {
      return "Тигр";
    }
  }

  public static class Lion extends Cat {
    @Override
    public String toString() {
      return "Лев";
    }
  }

  public static class Bull extends Animal {
    @Override
    public String toString() {
      return "Бык";
    }
  }

  public static class Cow extends Animal {
    @Override
    public String toString() {
      return "Корова";
    }
  }

  public static class Animal {
    @Override
    public String toString() {
      return "Животное";
    }
  }
}
