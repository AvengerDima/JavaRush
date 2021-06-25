package Level_9;

/*
Рефакторинг в соответствии с Naming and Code Convention 2
*/

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class lvl_9_task_2 {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        lvl_9_task_2 solution = new lvl_9_task_2();
        String nameOfFileToBeOpenedByNotepad = solution.getAbsolutePathToDefaultTxtFile().toString();
        Process notepad = solution.getStartNotepadProcess(nameOfFileToBeOpenedByNotepad);
        notepad.waitFor();
    }

    public Process getStartNotepadProcess(String fileName) throws IOException {
        String[] cmdArray = new String[]{"notepad.exe", fileName};
        return Runtime.getRuntime().exec(cmdArray);
    }

    public Path getAbsolutePathToDefaultTxtFile() throws URISyntaxException {
        URI uri = lvl_9_task_2.class.getResource("file.txt").toURI();
        return Paths.get(uri);
    }
}
