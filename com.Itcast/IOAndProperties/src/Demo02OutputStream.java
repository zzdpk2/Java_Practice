import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("IOAndProperties\\b.txt"));
        // write "100" into txt file, you need 3 bytes
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte[] bytes = {65, 66, 67, 68, 69};
//        Negative means Chinese, turn to GBK
//        byte[] bytes_1 = {-65, -66, -67, 68, 69};
        fos.write(bytes);
        fos.write(bytes, 2, 2);

        byte[] bytes_1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes_1));
        fos.write(bytes_1);



        fos.close();
    }
}
