package Level_2;

/*
Минимум трёх чисел
*/

public class lvl_2_task_15 {
  public static int min(int a, int b, int c) {

    int min;
    if(a <= b && a <= c){
      min = a;
    }else if(b <= a && b <= c){
      min = b;
    }else if(c <= a && c <= b){
      min = c;
    }else{
      min = 0;
    }

    return min;
  }

  public static void main(String[] args) throws Exception {

    System.out.println(min(1, 2, 3));
    System.out.println(min(-1, -2, -3));
    System.out.println(min(3, 5, 3));
    System.out.println(min(5, 5, 10));
  }
}
