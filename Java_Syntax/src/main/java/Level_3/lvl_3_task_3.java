package Level_3;

/*
Обмен валют
*/

public class lvl_3_task_3 {
  public static void main(String[] args) {

    System.out.println(convertEurToUsd(5, 0.87));
    System.out.println(convertEurToUsd(15,0.87));
  }

  public static double convertEurToUsd(int eur, double course) {

    double usd = eur * course;
    return usd;
  }
}
