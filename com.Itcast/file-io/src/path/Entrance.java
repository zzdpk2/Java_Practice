package path;

import java.io.File;

public class Entrance {

/*    C:\develop\a\a.txt windows
    C:/develop/a/a.txt linux*/
//    "C:" + File.separator + "develop" + File.separator + "a"

    // Absolute path
    // Relative path

//    C:\\develop\\a\\a.txt windows

    public static void main(String[] args) {
        show01();
    }

    /*File(String pathname)
    * pathname can be path of a directory or path of a file
    *
    * */

    private static void show01() {
        File f1 = new File(System.getProperty("user.dir") + File.separator + "test.txt");
        // toString method is override
        System.out.println("f1: " + f1);
        System.out.println(f1.getAbsolutePath());

        File d1 = new File("test.txt");
        
    }

}
