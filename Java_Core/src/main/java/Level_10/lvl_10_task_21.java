package Level_10;

/*
Сериализация под запретом
*/

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class lvl_10_task_21 implements Serializable {
    public static class SubSolution extends lvl_10_task_21 {
        private void writeObject(ObjectOutputStream out) throws Exception {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream in) throws Exception {
            throw new NotSerializableException();
        }

    }

    public static void main(String[] args) {

    }
}
