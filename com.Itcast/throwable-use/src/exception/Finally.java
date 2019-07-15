package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {

    public static void main(String[] args) {

        try {
            readFile("c:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close!");
        }

    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.equals("c:\\\\a.txt"))
            throw new FileNotFoundException("The filename is wrong!");
        System.out.println("The path is right!");
    }

}
