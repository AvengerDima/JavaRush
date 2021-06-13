package Level_8;

/*
Два в одном
*/

import java.io.*;

public class lvl_8_task_18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        FileInputStream inputStream2 = new FileInputStream(reader.readLine());

        while (inputStream1.available() > 0) {
            int data1 = inputStream1.read();

            outputStream.write(data1);
        }

        while (inputStream2.available() > 0) {
            int data2 = inputStream2.read();

            outputStream.write(data2);
        }

        outputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
