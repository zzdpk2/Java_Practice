package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionEntrance {
    public static void main(String[] args) /*throws ParseException*/ {

        // Exception
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);

        // Runtime Exception
        int[] array = {1, 2, 3};
        try{
            System.out.println(array[3]);
        }catch (Exception e){
            System.out.println(e);
        }

        // Error: OutOfMemoryError: Java Heap Space
//        int[] arr = new int[1024 * 1024 * 1024];
        int[] arr = new int[1024 * 1024];

    }
}
