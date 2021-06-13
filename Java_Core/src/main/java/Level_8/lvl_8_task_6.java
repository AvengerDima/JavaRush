package Level_8;

/*
Исправить ошибки
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lvl_8_task_6 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
