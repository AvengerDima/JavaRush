package Level_4;

/*
Без ошибок
*/

public class lvl_4_task_6 {
  public static void main(String[] args) {
    Object obj = new Jerry(); //Add your code here

    Mouse mouse = (Mouse) obj;
    GrayMouse grayMouse = (GrayMouse) mouse;
    Jerry jerry = (Jerry) grayMouse;

    printClasses(obj, mouse, grayMouse, jerry);

  }

  public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
    System.out.println(jerry.getClass().getSimpleName());
    System.out.println(grayMouse.getClass().getSimpleName());
    System.out.println(mouse.getClass().getSimpleName());
    System.out.println(obj.getClass().getSimpleName());
  }

  static class Mouse {
  }

  static class GrayMouse extends Mouse {
  }

  static class Jerry extends GrayMouse {
  }
}
