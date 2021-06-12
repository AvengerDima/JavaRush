package Level_5;

/*
Собираем прямоугольник
*/

public class lvl_5_task_13 {
  public int top;
  public int left;
  public int width = 0;
  public int height = 0;

  public void initialize(int top){
    this.top = top;
  }

  public void initialize(int top, int left){
    this.top = top;
    this.left = left;
  }

  public void initialize(int top, int left, int width){
    this.top = top;
    this.left = left;
    this.width = width;
  }

  public void initialize(int top, int left, int  width, int height){
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
  }

  public static void main(String[] args) {

  }
}
