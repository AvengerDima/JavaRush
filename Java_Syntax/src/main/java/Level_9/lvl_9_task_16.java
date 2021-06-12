package Level_9;

/*
Перехват checked-исключений
*/

import java.io.IOException;
import java.rmi.RemoteException;

public class lvl_9_task_16 {
  public static void main(String[] args) throws IOException, NoSuchFieldException {
    handleExceptions(new lvl_9_task_16());
  }

  public static void handleExceptions(lvl_9_task_16 obj) throws IOException, NoSuchFieldException, RemoteException {
    try {
      obj.method1();
      obj.method2();
      obj.method3();
    }
    catch (Exception e) {
      System.out.println( e);
    }
  }

  public void method1() throws IOException {
    throw new IOException();
  }

  public void method2() throws NoSuchFieldException {
    throw new NoSuchFieldException();
  }

  public void method3() throws RemoteException {
    throw new RemoteException();
  }
}
