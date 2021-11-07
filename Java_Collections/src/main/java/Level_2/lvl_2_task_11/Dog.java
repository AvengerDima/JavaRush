package Level_2.lvl_2_task_11;

import java.rmi.RemoteException;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() throws RemoteException {
        System.out.println("woof");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Dog " + name + " ");
    }
}
