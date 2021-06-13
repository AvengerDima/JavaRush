package Level_6.lvl_6_task_32;

public class Thread4 extends Thread implements Message {
  @Override
  public void showWarning() {
    this.interrupt();
  }

  @Override
  public void run() {
    while (!Thread4.interrupted()) {

    }
  }
}
