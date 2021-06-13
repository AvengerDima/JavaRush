package Level_2;

/*
Смена кодировки
*/

import java.io.*;

public class lvl_2_task_11 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "Windows-1251");
            FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
            OutputStreamWriter outPutStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");

            int charIn;
            while ((charIn = inputStreamReader.read()) != -1) {
                outPutStreamWriter.write(charIn);
            }

            fileInputStream.close();
            inputStreamReader.close();
            fileOutputStream.close();
            outPutStreamWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
