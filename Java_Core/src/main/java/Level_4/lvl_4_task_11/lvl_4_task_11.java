package Level_4.lvl_4_task_11;

/*
User, Loser, Coder and Proger
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_11 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Person person = null;
    String key = null;

    //тут цикл по чтению ключей, пункт 1
    while (true) {
      key = reader.readLine();
      //создаем объект, пункт 2
      if (key.equals("user")) {
        person = new Person.User();
      } else if (key.equals("loser")) {
        person = new Person.Loser();
      } else if (key.equals("coder")) {
        person = new Person.Coder();
      } else if (key.equals("proger")) {
        person = new Person.Proger();
      } else {
        break;
      }

      doWork(person); //вызываем doWork
    }
  }

  public static void doWork(Person person) {
    // пункт 3
    if (person instanceof Person.User) {
      ((Person.User) person).live();
    } else if (person instanceof Person.Loser) {
      ((Person.Loser) person).doNothing();
    } else if (person instanceof Person.Coder) {
      ((Person.Coder) person).writeCode();
    } else {
      ((Person.Proger) person).enjoy();
    }
  }
}
