package Level_9;

/*
Рефакторинг в соответствии с Naming and Code Convention
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class lvl_9_task_1 {
    public static final String DEFAULT_FILE_NAME = "C:/tmp/strange_file_name.tmp";

    private final String localFileName;
    private List<String> contentAslines;
    private boolean fileLoaded;

    public lvl_9_task_1(String firstFileName) {
        localFileName = firstFileName == null ? DEFAULT_FILE_NAME : firstFileName;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = lvl_9_task_1.class.getResource("Solution.java").getPath();

        lvl_9_task_1 solution = new lvl_9_task_1(fileName);
        solution.downloadFileContent();
        if (solution.isFileLoaded()) {
            System.out.println(solution.hasExpectedLine("public class Solution {"));   // Expected true
            System.out.println(solution.hasExpectedLine(" public class Solution {"));  // Expected false
        }
    }

    public boolean isFileLoaded() {
        return fileLoaded;
    }

    public void downloadFileContent() {
        try {
            contentAslines = Files.readAllLines((new File(localFileName)).toPath(), Charset.defaultCharset());
            fileLoaded = true;
        } catch (IOException e) {
            System.out.println("Unsuccessful. What a surprise!");
        }
    }

    public boolean hasExpectedLine(String expectedLine) {
        return contentAslines.contains(expectedLine);
    }
}
