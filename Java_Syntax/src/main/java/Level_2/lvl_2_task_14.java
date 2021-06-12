package Level_2;

/*
Минимум двух чисел
*/

public class lvl_2_task_14 {
  public static int min(int a, int b) {

    int min;
    if(a < b){
      min = a;
    } else if(b < a){
      min = b;
    } else{
      min = 0;
    }

    return min;
  }

  public static void main(String[] args) throws Exception {

    System.out.println(min(12, 33));
    System.out.println(min(-20, 0));
    System.out.println(min(-10, -20));
  }
}
