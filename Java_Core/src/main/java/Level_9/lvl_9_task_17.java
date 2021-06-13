package Level_9;

/*
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class lvl_9_task_17 {
    private FileWriter fileWriter = null;

    public lvl_9_task_17(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public lvl_9_task_17(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public lvl_9_task_17(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public lvl_9_task_17(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public lvl_9_task_17(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }

    public static void main(String[] args) {

    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for(char i:cbuf)
            System.out.print(i);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for(int i=off;i<off+len;i++)
            System.out.print(cbuf[i]);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.print(str.substring(off,off+len));
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
