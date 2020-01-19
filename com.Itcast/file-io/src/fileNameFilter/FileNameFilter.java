package fileNameFilter;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\Java_Practice\\Test");
        getAllTxts(file);
    }

    public static void getAllTxts(File dir){

//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".txt");
//            }
//        });

        // Lambda optimization
//        File[] files = dir.listFiles((File d, String name)->{
//            return new File(d, name).isDirectory() || name.toLowerCase().endsWith(".txt");
//        });

        // Final Optimization
        File[] files = dir.listFiles((d, name)-> new File(d, name).isDirectory() || name.toLowerCase().endsWith(".txt"));

        for(File file: files){
            if(file.isDirectory())  getAllTxts(file);

            else System.out.println(file);
        }
    }
}
