package date;

import java.util.Date;

public class DateObj {

    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);

        date = new Date(237497329040L);
        System.out.println(date);
    }


    // to get current system date and time
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }

}
