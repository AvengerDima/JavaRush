package Level_4;

/*
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_41 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    if((a < b && a > c) || (a > b && a < c)){
      System.out.println(a);
    } else if((b > a && b < c) || (b < a && b > c)){
      System.out.println(b);
    } else if((c > a && c < b) || (c < a && c > b)){
      System.out.println(c);
    } else if((a > c && b > c) || (a < c && b < c)){
      System.out.println(a);
    } else if((b > a && c > a) || (b < a && c < a)){
      System.out.println(b);
    } else if((a > b && c > b) || (a < b && c < b)){
      System.out.println(c);
    } else if(a == b && b == c && a == c){
      System.out.println(c);
    } else{
      System.out.println("Ошибка");
    }
  }
}
