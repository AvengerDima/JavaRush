package Level_8.lvl_8_task_14;

/*
UnsupportedFileName
*/

import java.io.FileInputStream;
import java.io.IOException;

public class lvl_8_task_14 extends FileInputStream {
    public lvl_8_task_14(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);

        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
