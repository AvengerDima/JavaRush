package Level_3;

/*
Это кто там такой умный?
*/

public class lvl_3_task_10 {
  public static void main(String[] args) throws Exception {
  }

  interface Person {
    void use(Person person);

    void startToWork();
  }

  interface Workable {
    boolean wantsToGetExtraWork();
  }

  interface Secretary extends Person {
  }

  interface Boss extends Person, Workable{
  }

  class CleverMan implements Boss {
    public void use(Person person) {
      person.startToWork();
    }

    public void startToWork() {
    }

    public boolean wantsToGetExtraWork() {
      return true;
    }
  }

  class SmartGirl implements Secretary {
    public void use(Person person) {
    }

    public void startToWork() {
    }
  }
}
