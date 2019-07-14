package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");

            // throw out the type of exception
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("not a txt file!");
        }

        System.out.println("-----------------");

    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.equals("c:\\\\a.txt"))
            throw new FileNotFoundException("The filename is wrong!");
    }

}
