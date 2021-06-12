package Level_2;

/*
Наш первый конвертер!
*/

public class lvl_2_task_7 {
  public static void main(String[] args) {

    System.out.println(convertCelsiumToFahrenheit(41));
  }

  public static double convertCelsiumToFahrenheit(int celsium) {

    //double TC = 9/5.0 * celsium + 32;
    double TC = (celsium - 32) * 5/9;
    return TC;
  }
}
