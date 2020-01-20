import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        File f_test = new File("IOAndProperties\\09.txt");
        FileOutputStream fos = new FileOutputStream("IOAndProperties\\09.txt");
        fos.write(97);
        fos.close();
    }
}
