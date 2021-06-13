package Level_9;

/*
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class lvl_9_task_14 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString().replaceAll("\n", "");
        System.setOut(consoleStream);

        String[] str = result.split(" ");
        if (str[1].equals("+"))
            result += Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        if (str[1].equals("*"))
            result += Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        if (str[1].equals("-"))
            result += Integer.parseInt(str[0]) - Integer.parseInt(str[2]);

        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
