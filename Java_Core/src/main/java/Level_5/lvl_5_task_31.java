package Level_5;

/*
Факториал
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class lvl_5_task_31 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int input = Integer.parseInt(reader.readLine());
    reader.close();

    System.out.println(factorial(input));
  }

  public static String factorial(int n) {
    //add your code here
    BigInteger a = BigInteger.valueOf(1);

    if(n < 0){
      return "0";
    }else {
      if(n <= 150){
        for (int i = 1; i <= n; ++i) {
          a = a.multiply(BigInteger.valueOf(i));
        }
      }
    }
    return a.toString();
  }
}
