package Level_4.lvl_4_task_11;

public interface Person {
  class User implements Person {
    void live() {
      System.out.println("I usually just live.");
    }
  }

  class Loser implements Person {
    void doNothing() {
      System.out.println("I usually do nothing.");
    }
  }

  class Coder implements Person {
    void writeCode() {
      System.out.println("I usually write code.");
    }
  }

  class Proger implements Person {
    void enjoy() {
      System.out.println("It's a wonderful life!");
    }
  }
}
