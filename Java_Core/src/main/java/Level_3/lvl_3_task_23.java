package Level_3;

/*
Интерфейс Updatable в классе Screen
*/

public class lvl_3_task_23 {
  public static void main(String[] args) throws Exception {
  }

  interface Selectable {
    void onSelect();
  }

  interface Updatable extends Selectable {
    void refresh();
  }

  class Screen implements Updatable {
    @Override
    public void onSelect() {

    }

    @Override
    public void refresh() {

    }
  }
}
