package Level_3;

/*
Один метод в классе
*/

import java.awt.*;

public class lvl_3_task_24 {
  public static void main(String[] args) throws Exception {
  }

  public interface Animal {
    Color getColor();

    Integer getAge();
  }

  public abstract static class Fox implements Animal {
    public String getName() {
      return "Fox";
    }
  }
}
