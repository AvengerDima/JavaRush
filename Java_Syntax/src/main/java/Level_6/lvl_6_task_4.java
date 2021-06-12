package Level_6;

/*
Ставим котов на счётчик
*/

public class lvl_6_task_4 {
  public static int catCount = 0;

  public lvl_6_task_4(){
    catCount++;
  }

  protected void finalize() throws Throwable{
    catCount--;
  }

  public static void main(String[] args) {

  }
}
