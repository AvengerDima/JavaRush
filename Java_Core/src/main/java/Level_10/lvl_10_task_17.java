package Level_10;

/*
Десериализация
*/

import java.io.ObjectInputStream;
import java.io.Serializable;

public class lvl_10_task_17 {
    public A getOriginalObject(ObjectInputStream objectStream) {
        Object object;
        try {
            object = objectStream.readObject();
            if (!(object instanceof A)) {
                return null;
            } else return (A) object;
        } catch (Exception e) {
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
