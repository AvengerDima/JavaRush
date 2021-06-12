package Level_4;

/*
Как зовут кота?
*/

public class lvl_4_task_3 {
  private String name = "безымянный кот";

  public void setName(String name) {

    this.name = name;
  }

  public static void main(String[] args) {
    lvl_4_task_3 cat = new lvl_4_task_3();
    cat.setName("Жужик");
    System.out.println(cat.name);
  }
}
