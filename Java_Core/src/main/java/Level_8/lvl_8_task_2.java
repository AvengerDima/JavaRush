package Level_8;

/*
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lvl_8_task_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        long min = inputStream.read();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data < min) {
                min = data;
            }
        }

        inputStream.close();
        System.out.println(min);
    }
}
