package Level_5;

/*
Конструктор
*/

public class lvl_5_task_23 {
  public Color color;

  public static void main(String[] args) {
    lvl_5_task_23 circle = new lvl_5_task_23();
    circle.color.setDescription("Red");
    System.out.println(circle.color.getDescription());
  }

  public lvl_5_task_23() {

    this.color = new Color();
  }

  public class Color {
    String description;

    public String getDescription() {

      return description;
    }

    public void setDescription(String description) {

      this.description = description;
    }
  }
}
