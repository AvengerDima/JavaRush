package Level_4;

/*
Ближайшее к 10
*/

public class lvl_4_task_9 {
  public static void main(String[] args) {
    displayClosestToTen(8, 11);
    displayClosestToTen(7, 14);
  }

  public static void displayClosestToTen(int a, int b) {

    int x = 10;
    int d = abs(x - a);
    int e = abs(x - b);
    if(d > e){
      System.out.println(b);
    } else{
      System.out.println(a);
    }
  }

  public static int abs(int a) {
    if (a < 0) {
      return -a;
    } else {
      return a;
    }
  }
}
