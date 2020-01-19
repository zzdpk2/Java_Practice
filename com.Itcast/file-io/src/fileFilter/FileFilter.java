package fileFilter;

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\Java_Practice\\Test");
        getAllTxts(file);
    }

    public static void getAllTxts(File dir){

        File[] files = dir.listFiles(new FileFilterImpl());
        for(File file: files){
            if(file.isDirectory())  getAllTxts(file);
//            if(file.toString().endsWith("txt"))
//                System.out.println(file);
            else System.out.println(file);
        }
    }
}
