package Level_3.lvl_3_task_27;

import java.util.List;

public class RepkaStory {
  static void tell(List<Person> items) {
    Person first;
    Person second;
    for (int i = items.size() - 1; i > 0; i--) {
      first = items.get(i);
      second = items.get(i - 1);
      first.pull(second);
    }
  }
}
