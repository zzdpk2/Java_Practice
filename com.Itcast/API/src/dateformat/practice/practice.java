package dateformat.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("yyyy-MM-dd");
        String birthday = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        // Change to miliseconds
        long gapdays = (new Date().getTime() - date.getTime()) / 1000 / 86400;
        System.out.println(gapdays + " days");
    }

}
