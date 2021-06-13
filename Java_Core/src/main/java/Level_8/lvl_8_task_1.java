package Level_8;

/*
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lvl_8_task_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        long max = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > max) {
                max = data;
            }
        }

        inputStream.close();
        System.out.println(max);
    }
}
