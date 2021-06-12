package Level_4;

/*
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_24 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    if(a != b & b == c){
      System.out.println(1);
    } else if(b != a & a == c){
      System.out.println(2);
    } else if(c != a & a == b){
      System.out.println(3);
    } else{

    }
  }
}
