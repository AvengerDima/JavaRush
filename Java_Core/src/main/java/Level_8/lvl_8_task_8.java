package Level_8;

/*
Разделение файла
*/

import java.io.*;

public class lvl_8_task_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        int parity = inputStream.available() % 2;
        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
            outputStream1.write(buffer,0,count / 2 + parity);
            outputStream2.write(buffer,count / 2 + parity,count / 2);
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
