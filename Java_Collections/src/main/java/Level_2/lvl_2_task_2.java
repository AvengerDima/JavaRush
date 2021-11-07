package Level_2;

/*
Используем RandomAccessFile
*/

import java.io.IOException;
import java.io.RandomAccessFile;

public class lvl_2_task_2 {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            long number = Long.parseLong(args[1]);
            String text = args[2];
            long fileLength = raf.length();
            raf.seek(number);
            byte[] readBytes = new byte[text.length()];
            raf.read(readBytes, 0, text.length());
            String readString = new String(readBytes);
            raf.seek(fileLength);

            if (readString.equals(text)) {
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
