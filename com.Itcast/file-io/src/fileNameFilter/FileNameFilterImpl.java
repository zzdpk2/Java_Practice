package fileNameFilter;

import java.io.File;
import java.io.FileFilter;

public class FileNameFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())  return true;
        return pathname.toString().toLowerCase().endsWith(".txt");
    }
}
