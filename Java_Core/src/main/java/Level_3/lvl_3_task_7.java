package Level_3;

/*
Параметризованый интерфейс
*/

public class lvl_3_task_7 {
  public static void main(String[] args) throws Exception {
  }

  interface SimpleObject<T> {
    SimpleObject<T> getInstance();
  }

  class StringObject implements SimpleObject<String> //допишите здесь ваш код
  {
    @Override
    public SimpleObject<String> getInstance() {
      return null;
    }
  }
}
