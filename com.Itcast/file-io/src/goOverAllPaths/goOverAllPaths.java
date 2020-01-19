package goOverAllPaths;

import java.io.File;

public class goOverAllPaths {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\Java_Practice\\Test");
        getAllFiles(file);
    }

    public static void getAllFiles(File dir){

        File[] files = dir.listFiles();
        for (File file: files)  {
            if(file.isDirectory())  getAllFiles(file);
            System.out.println(file);
        }

    }
}
