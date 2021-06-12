package Level_6;

/*
Пустые кошки, пустые псы
*/

public class lvl_6_task_2 {
  public static void main(String[] args) {

  }

  protected void finalize() throws Throwable{
    System.out.println("A Cat was destroyed");
  }
}

class Dog {
  protected void finalize() throws Throwable{
    System.out.println("A Dog was destroyed");
  }
}
