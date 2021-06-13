package Level_8;

/*
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class lvl_8_task_19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(filename1);
        byte[] buffer1 = new byte[inputStream.available()];
        inputStream.read(buffer1);
        inputStream.close();

        inputStream = new FileInputStream(filename2);
        byte[] buffer2 = new byte[inputStream.available()];
        inputStream.read(buffer2);
        inputStream.close();

        byte[] bigbuff = new byte[buffer1.length + buffer2.length];
        System.arraycopy(buffer2, 0, bigbuff, 0, buffer2.length);
        System.arraycopy(buffer1, 0, bigbuff, buffer2.length, buffer1.length);

        FileOutputStream outputStream = new FileOutputStream(filename1);
        outputStream.write(bigbuff);
        outputStream.close();
    }
}
