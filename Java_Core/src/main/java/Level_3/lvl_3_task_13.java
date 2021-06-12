package Level_3;

/*
Лисица — это такое животное
*/

import java.awt.*;

public class lvl_3_task_13 {
  public static void main(String[] args) throws Exception {
  }

  public interface Animal {
    Color getColor();
  }

  public static abstract class Fox implements Animal {
    public String getName() {
      return "Fox";
    }
  }
}
