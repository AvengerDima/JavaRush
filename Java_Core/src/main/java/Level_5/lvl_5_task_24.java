package Level_5;

/*
Порядок загрузки переменных
*/

public class lvl_5_task_24 {
  static {
    init();
    System.out.println("Static block");
  }

  {
    System.out.println("Non-static block");
    printAllFields(this);
  }

  public int i = 6;

  public String name = "First name";
  static {
  }

  public lvl_5_task_24() {
    System.out.println("Solution constructor");
    printAllFields(this);
  }

  public static void init() {
    System.out.println("static void init()");

  }

  public static void main(String[] args) {
    System.out.println("public static void main");
    lvl_5_task_24 s = new lvl_5_task_24();
  }

  public static void printAllFields(lvl_5_task_24 obj) {
    System.out.println("static void printAllFields");
    System.out.println(obj.i);
    System.out.println(obj.name);
  }
}
