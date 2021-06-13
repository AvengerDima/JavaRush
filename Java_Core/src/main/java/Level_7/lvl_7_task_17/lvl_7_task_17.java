package Level_7.lvl_7_task_17;

/*
ApplicationContext
*/

import java.util.HashMap;
import java.util.Map;

public abstract class lvl_7_task_17<GenericsBean extends Bean> {
  private Map<String, GenericsBean> container = new HashMap<String, GenericsBean>();
  // Map<Name, some class that implements the Bean interface>


  protected lvl_7_task_17() {
    parseAllClassesAndInterfaces();
  }

  public synchronized GenericsBean getByName(String name) {
    return container.get(name);
  }

  public synchronized GenericsBean removeByName(String name) {
    return container.remove(name);
  }

  protected abstract void parseAllClassesAndInterfaces();

  public static void main(String[] args) {

  }
}
