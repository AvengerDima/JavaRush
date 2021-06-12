package Level_4;

/*
Попадём-не-попадём
*/

public class lvl_4_task_10 {
  public static void main(String[] args) {

    checkInterval(60);
    checkInterval(112);
    checkInterval(10);
  }

  public static void checkInterval(int a) {

    if(a >= 50 && a <= 100){
      System.out.println("Число " + a + " содержится в интервале.");
    } else{
      System.out.println("Число " + a + " не содержится в интервале.");
    }
  }
}
