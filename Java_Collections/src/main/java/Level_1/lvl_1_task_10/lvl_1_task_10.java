package Level_1.lvl_1_task_10;

/*
Null Object Pattern
*/

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class lvl_1_task_10 {
    private FileData fileData;

    public lvl_1_task_10(String pathToFile) {
        try {
            Path path = Paths.get(pathToFile);
            fileData = new ConcreteFileData(Files.isHidden(path), Files.isExecutable(path), Files.isDirectory(path), Files.isWritable(path));
        } catch (Exception e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
