package Level_5;

/*
Статики и котики
*/

public class lvl_5_task_18 {
  public static Cat cat;

  public static void main(String[] args) {

  }

  public static class Cat {
    public String name;

    static {
      cat = new Cat();
      cat.name = "Kisa";
      System.out.println(cat.name);
    }
  }
}
