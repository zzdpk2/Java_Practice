package path;

import java.io.File;
import java.io.IOException;

public class Entrance {

/*    C:\develop\a\a.txt windows
    C:/develop/a/a.txt linux*/
//    "C:" + File.separator + "develop" + File.separator + "a"

    // Absolute path
    // Relative path

//    C:\\develop\\a\\a.txt windows

    public static void main(String[] args) {
        show01();
        createTestFiles();
        traverseDirectories();
    }

    /*File(String pathname)
    * pathname can be path of a directory or path of a file
    *
    * */

    private static void show01() {
        File f1 = new File(System.getProperty("user.dir") + File.separator+ "test.txt");
        // toString method is override
        System.out.println("f1: " + f1);
        System.out.println(f1.getAbsolutePath());

        File d1 = new File("test.txt");
        d1.delete();
    }

    private static void createTestFiles(){
        File[] files = new File[5];
        files[0] = new File( "d1");
        files[0].mkdirs();
        files[1] = new File("d1" + File.separator + "test");
        files[1].mkdirs();
        files[2] = new File("d1" + File.separator + "test" + File.separator + "test.txt");
        files[3] = new File("d1" + File.separator + "test" + File.separator + "test1.txt");
        files[4] = new File("d1" + File.separator + "test" + File.separator + "test2.txt");
        try {
            files[2].createNewFile();
            files[3].createNewFile();
            files[4].createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed!");
        }

        System.out.println("Success!");

    }

    private static void traverseDirectories(){
        File file = new File("d1" + File.separator + "test");
        String[] list = file.list();
        for (String unit : list)    System.out.println(unit);

        File[] files = file.listFiles();
        for(File unit : files)  System.out.println(unit);

    }

}
