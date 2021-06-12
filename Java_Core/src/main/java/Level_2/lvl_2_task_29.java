package Level_2;

/*
Родитель класса CTO
*/

public class lvl_2_task_29 {
  public static void main(String[] args) {
    CTO cto = new CTO();
    System.out.println(cto);
  }

  public static interface Businessman {
    public void workHard();
  }

  public static class Worker {
    public void workHard() {

    }
  }

  public static class CTO extends Worker implements Businessman {

  }
}
