package Level_8;

/*
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class lvl_8_task_17 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int space = 0;

        FileInputStream inputStream = new FileInputStream(args[0]);

        while (inputStream.available() > 0) {
            count++;

            if (inputStream.read() == ' ') {
                space++;
            }
        }

        float result = (float) ((float) space / count * 100.0);

        System.out.println(String.format("%.2f", result));

        inputStream.close();
    }
}
