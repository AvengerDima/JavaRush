package Level_8;

/*
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_8_task_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int count = 0;

        while (inputStream.available() > 0) {
            if (inputStream.read() == 44) {
                count++;
            } else {

            }
        }

        inputStream.close();
        System.out.println(count);
    }
}
