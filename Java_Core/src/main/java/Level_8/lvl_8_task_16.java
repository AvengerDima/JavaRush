package Level_8;

/*
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class lvl_8_task_16 {
    public static void main(String[] args) throws IOException {
        int count = 0;

        if (args.length > 0) {
            FileInputStream inputStream = new FileInputStream(args[0]);

            while (inputStream.available() > 0) {
                int data = inputStream.read();

                if ((data >= Integer.valueOf('A') && data <= Integer.valueOf('Z')) || (data >= Integer.valueOf('a')
                        && data <= Integer.valueOf('z'))) {
                    count++;
                }
            }

            inputStream.close();
        }

        System.out.println(Integer.valueOf(count));
    }
}
