package Level_3;

/*
Сумма цифр трехзначного числа
*/

public class lvl_3_task_26 {
  public static void main(String[] args) {

    System.out.println(sumDigitsInNumber(546));
  }

  public static int sumDigitsInNumber(int number) {

    int sum1 = number % 10;
    int sum2 = number % 100 / 10;
    int sum3 = number / 100;

    int sum4 = sum1 + sum2 + sum3;
    return sum4;
  }
}
