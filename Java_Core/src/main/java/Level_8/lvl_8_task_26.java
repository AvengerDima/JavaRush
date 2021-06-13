package Level_8;

/*
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lvl_8_task_26 {
    public static void main(String[] args) throws IOException {
        FileInputStream iStream = new FileInputStream(args[1]);
        FileOutputStream oStream = new FileOutputStream(args[2]);

        byte[] array = new byte[iStream.available()];
        iStream.read(array);
        iStream.close();

        for (byte element: array) {
            if (args[0].equals("-e")) oStream.write(element+1);
            if (args[0].equals("-d")) oStream.write(element-1);
        }

        oStream.close();
    }
}
