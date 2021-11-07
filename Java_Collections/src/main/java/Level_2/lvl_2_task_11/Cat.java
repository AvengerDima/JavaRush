package Level_2.lvl_2_task_11;

import java.rmi.RemoteException;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void speak() throws RemoteException {
        System.out.println("meow");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Cat " + name + " ");
    }
}
