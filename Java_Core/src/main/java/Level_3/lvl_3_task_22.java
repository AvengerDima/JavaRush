package Level_3;

/*
Интерфейс SimpleObject
*/

public class lvl_3_task_22 {
  public static void main(String[] args) throws Exception {
    StringObject stringObject = new StringObject();
  }

  interface SimpleObject<T> {
    SimpleObject<T> getInstance();
  }

  public static class StringObject implements SimpleObject {
    @Override
    public SimpleObject<String> getInstance() {
      return null;
    }
  }
}
