package dateformat;

//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_ {

    public static void main(String[] args) throws ParseException{
        demo01();
        demo02();
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = sdf.parse("2019-07-01 19-54-40");
        System.out.println(date);
    }

    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }


}
