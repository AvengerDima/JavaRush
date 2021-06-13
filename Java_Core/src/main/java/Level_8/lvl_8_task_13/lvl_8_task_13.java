package Level_8.lvl_8_task_13;

/*
AmigoOutputStream
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class lvl_8_task_13 extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream outputStream;

    public lvl_8_task_13(FileOutputStream outputStream) throws IOException {
        super(fileName);
        this.outputStream = outputStream;
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        outputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        outputStream.flush();
        String text = "JavaRush © All rights reserved.";
        outputStream.write(text.getBytes());
        outputStream.close();
    }

    public static void main(String[] args) throws FileNotFoundException,IOException {
        new lvl_8_task_13(new FileOutputStream(fileName));
    }
}
