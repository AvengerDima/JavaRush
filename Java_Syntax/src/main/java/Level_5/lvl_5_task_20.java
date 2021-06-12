package Level_5;

/*
Создать класс прямоугольник (Rectangle)
*/

public class lvl_5_task_20 {
  public int top;
  public int left;
  public int width = 0;
  public int height = 0;

  public lvl_5_task_20(int top){

    this.top = top;
  }

  public lvl_5_task_20(int top, int left){
    this.top = top;
    this.left = left;
  }

  public lvl_5_task_20(int top, int left, int width){
    this.top = top;
    this.left = left;
    this.width = width;
  }

  public lvl_5_task_20(int top, int left, int width, int height){
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
  }

  public static void main(String[] args) {

  }
}
