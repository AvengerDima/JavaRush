package Level_6;

/*
Кот и статика
*/

public class lvl_6_task_13 {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++){
      Cat cat = new Cat();
    }
    System.out.println(Cat.catCount);
  }

  public static class Cat {
    public static int catCount;

    public Cat(){
      Cat.catCount++;
    }
  }
}
