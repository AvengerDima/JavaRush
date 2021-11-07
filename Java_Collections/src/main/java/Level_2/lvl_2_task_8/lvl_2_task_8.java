package Level_2.lvl_2_task_8;

/*
Создание прокси-объекта
*/

import java.lang.reflect.Proxy;

public class lvl_2_task_8 {
    public static void main(String[] args) {
        SomeInterfaceWithMethods obj = getProxy();
        obj.stringMethodWithoutArgs();
        obj.voidMethodWithIntArg(1);

        /* expected output
        stringMethodWithoutArgs in
        inside stringMethodWithoutArgs
        stringMethodWithoutArgs out
        voidMethodWithIntArg in
        inside voidMethodWithIntArg
        inside voidMethodWithoutArgs
        voidMethodWithIntArg out
        */
    }

    public static SomeInterfaceWithMethods getProxy() {
        SomeInterfaceWithMethods original = new SomeInterfaceWithMethodsImpl();

        ClassLoader classLoader = SomeInterfaceWithMethods.class.getClassLoader();
        Class[] interfaces = {SomeInterfaceWithMethods.class};
        CustomInvocationHandler handler = new CustomInvocationHandler(original);

        return (SomeInterfaceWithMethods) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
