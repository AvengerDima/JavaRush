package Level_2.lvl_2_task_10;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DoubleString extends Remote {
    String doubleString(String str) throws RemoteException;
}
