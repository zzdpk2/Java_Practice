package filemethods;

import java.io.File;

public class Entrance {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        File f1 = new File("D:\\Projects\\Java_Practice\\com.Itcast\\file-io\\src\\filemethods\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);

        long length1 = f1.length();
        System.out.println(length1);

    }

    private static void show02() {
        File f1 = new File("D:\\Projects\\Java_Practice\\com.Itcast\\file-io\\src\\filemethods\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);
        String path2 = f2.getPath();
        System.out.println(path2);
    }

    private static void show01() {
        File f1 = new File("D:\\Projects\\Java_Practice\\com.Itcast\\file-io\\src\\filemethods\\a.txt");
        String path1 = f1.getAbsolutePath();
        System.out.println(path1);

        File f2 = new File("a.txt");
        String path2 = f2.getAbsolutePath();
        System.out.println(path2);
    }
}
