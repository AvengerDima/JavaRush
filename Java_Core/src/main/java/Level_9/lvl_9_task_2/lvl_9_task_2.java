package Level_9.lvl_9_task_2;

/*
Адаптер
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class lvl_9_task_2 implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public static void main(String[] args) {

    }

    public lvl_9_task_2(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}
