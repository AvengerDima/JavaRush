package Level_5;

/*
ООП - Перегрузка
*/

public class lvl_5_task_7 {
  public static void main(String[] args) {
    printMatrix(2, 3, "8");
  }

  public static void printMatrix(int m, int n, String value) { //1
    System.out.println("Заполняем объектами String");
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(int m, int n, Object value) { //2
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(value);
      }
      System.out.println();
    }
  }

  public static void printMatrix(int m, int n, int value) { //3
    printMatrix(m, n, (Integer) value);
  }

  public static void printMatrix(Integer m, int n, int value) { //4
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(int m, Integer n, int value) { //5
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(short m, int n, int value) { //6
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(int m, short n, String value) { //7
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(short m, short n, int value) { //8
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(Integer m, Integer n, int value) { //9
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(String m, int n, Object value) { //10
    printMatrix(m, n, (String) value);
  }
}
