package Level_8.lvl_8_task_13;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        return ((f.isDirectory()))
                || (f.getName().toLowerCase().endsWith(".htm"))
                || (f.getName().toLowerCase().endsWith(".html"));
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}
