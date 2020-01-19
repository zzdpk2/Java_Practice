package fileFilterLambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\Java_Practice\\Test");
        getAllTxts(file);
    }

    public static void getAllTxts(File dir){

//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".txt");
//            }
//        });

//        File[] files = dir.listFiles((File d) -> {return d.isDirectory() || d.toString().toLowerCase().endsWith(".txt");});

        File[] files = dir.listFiles((d -> d.isDirectory() || d.toString().toLowerCase().endsWith(".txt")));

        for(File file: files){
            if(file.isDirectory())  getAllTxts(file);
            else System.out.println(file);
        }
    }
}
