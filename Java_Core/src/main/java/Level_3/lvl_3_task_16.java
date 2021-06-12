package Level_3;

/*
Некорректные строки
*/

public class lvl_3_task_16 {
  public static void main(String[] args) throws Exception {
    System.out.println(SimpleObject.NAME);
    System.out.println(Button.NAME);
  }

  interface SimpleObject {
    String NAME = "SimpleObject";

    void onPress();
  }

  interface Button extends SimpleObject {

    final String NAME = "Submit";

    void onPress();

    String onPress(Object o);
  }
}
