package Level_5.lvl_5_task_21;

public class Tree {
  public static int globalNumber;
  public int number;

  public Tree() {
    this.number = ++globalNumber;
  }

  public void info(Object s) {
    System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
  }

  public void info(Number s) {
    System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName()));
  }

  public void info(String s) {
    System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
  }
}
