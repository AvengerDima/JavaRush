package Level_3;

/*
Selectable и Updatable
*/

public class lvl_3_task_4 {
  public static void main(String[] args) throws Exception {
  }

  interface Selectable {
    void onSelect();
  }

  interface Updatable {
    void refresh();
  }

  //напишите тут ваш класс
  public class Screen implements Selectable, Updatable {
    @Override
    public void onSelect() {

    }

    @Override
    public void refresh() {

    }
  }
}
