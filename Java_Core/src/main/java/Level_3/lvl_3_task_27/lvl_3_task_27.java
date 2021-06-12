package Level_3.lvl_3_task_27;

/*
Репка
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_3_task_27 {
  public static void main(String[] args) {
    List<Person> plot = new ArrayList<Person>();
    plot.add(new Person("Репка", "Репку"));
    plot.add(new Person("Дедка", "Дедку"));
    plot.add(new Person("Бабка", "Бабку"));
    plot.add(new Person("Внучка", "Внучку"));
    RepkaStory.tell(plot);
  }
}
