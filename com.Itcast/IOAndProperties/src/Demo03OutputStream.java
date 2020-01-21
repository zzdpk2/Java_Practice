import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("IOAndProperties\\c.txt"), true);

        for (int i = 0; i < 10; i++) {
            fos.write("niubi".getBytes());
            fos.write("wo".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();

    }
}
