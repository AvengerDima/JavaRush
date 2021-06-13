package Level_1;

/*
Сравниваем модификаторы
*/

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class lvl_1_task_1 {
    public static void main(String[] args) {
        int classModifiers = lvl_1_task_1.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        int mod = allModifiers & specificModifier;
        return mod == specificModifier ? true : false;
    }

    private static Method getMainMethod() {
        Method[] methods = lvl_1_task_1.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
