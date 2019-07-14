package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsUse {
    public static void main(String[] args) throws /*FileNotFoundException,*/ IOException {
//        readFile("c:\\a.txt");
        readFile("d:\\a.txt");
    }

    public static void readFile(String fileName) throws /*FileNotFoundException,*/ IOException{
        if(!fileName.equals("c:\\\\a.txt"))
            throw new FileNotFoundException("The filename is wrong!");

        if(!fileName.endsWith(".txt"))
            throw new IOException("The input file is error!");

    }

}
