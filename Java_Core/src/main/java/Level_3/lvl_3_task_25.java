package Level_3;

/*
Компиляция программы
*/

import java.awt.*;

public class lvl_3_task_25 {
  public static void main(String[] args) throws Exception {
    Fox bigFox = new BigFox();
    System.out.println(bigFox.getName());
    System.out.println(bigFox.getColor());
  }

  public interface Animal {
    Color getColor();
  }

  public abstract static class Fox implements Animal {
    public String getName() {
      return "Fox";
    }
  }

  public static class BigFox extends Fox {
    @Override
    public Color getColor() {
      return null;
    }
  }
}
