import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("IOAndProperties\\b.txt"));
        // write "100" into txt file, you need 3 bytes
        fos.write(49);
        fos.write(48);
        fos.write(48);

        fos.close();
    }
}
