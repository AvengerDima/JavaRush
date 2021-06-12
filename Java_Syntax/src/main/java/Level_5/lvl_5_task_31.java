package Level_5;

/*
Совершенствуем функциональность
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_5_task_31 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
    int d = Integer.parseInt(reader.readLine());
    int e = Integer.parseInt(reader.readLine());

    int minimum = min(a, b, c, d, e);

    System.out.println("Minimum = " + minimum);
  }

  public static int min(int a, int b, int c, int d, int e) {

    if(a <= b && a <= c && a <= d && a <= e){
      return a;
    } else if(b <= a && b <= c && b <= d && b <= e){
      return b;
    } else if(c <= a && c <= b && c <= d && c <= e){
      return c;
    } else if(d <= a && d <= b && d <= c && d <= e){
      return d;
    } else{
      return e;
    }
  }
}
