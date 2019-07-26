import java.io.File;

public class Entrance {
    public static void main(String[] args) {
        show01();
        show02("c:", "a.txt");
        show03();
    }

    private static void show03() {
        File parent = new File("D:\\");
        File file = new File("hello, java");
        System.out.println(file);
    }

    private static void show02(String parent, String child) {
        File f1 = new File(parent, child);
        System.out.println(f1);

    }

    private static void show01() {
        File f1 = new File("D:\\Projects\\Java_Practice\\com.Itcast\\file-io\\src\\a.txt");
        System.out.println(f1);
    }
}
