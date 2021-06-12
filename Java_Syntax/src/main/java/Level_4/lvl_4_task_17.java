package Level_4;

/*
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_17 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    if(a == b & a != c & b != c){
      System.out.println(a + " " + b);
    } else if(b == c & b != a & c != a){
      System.out.println(b + " " + c);
    } else if(a == c & a != b & c != b){
      System.out.println(a + " " + c);
    } else if(a == b & b == c & a == c){
      System.out.println(a + " " + b + " " + c);
    }
  }
}
