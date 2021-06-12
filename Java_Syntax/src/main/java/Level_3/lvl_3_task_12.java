package Level_3;

/*
Набираем воду в бассейн
*/

public class lvl_3_task_12 {
  public static void main(String[] args) {

    System.out.println(getVolume(25, 5, 2));
  }

  public static long getVolume(int a, int b, int c) {

    long water = a * b * c * 1000;
    return water;
  }
}
