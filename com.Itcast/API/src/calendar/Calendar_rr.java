package calendar;

import java.util.Calendar;
import java.util.Date;

public class Calendar_rr {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    private static void demo04() {

        Calendar calendar = Calendar.getInstance();

        Date time = calendar.getTime();

        System.out.println(time);

    }

    private static void demo03() {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.YEAR, 1);
    }


    private static void demo02() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 999);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DATE, 9);

        calendar.set(2009,9,10);

    }

    //    int field: arguments
//    public static final int YEAR = 1;
//    public static final int MONTH = 1;
//    public static final int DATE = 1;
//    public static final int DAY_OF_MONTH = 1;
//    public static final int HOUR = 1;
//    public static final int MINUTE = 1;
//    public static final int SECOND = 1;
    private static void demo01() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println(calendar.get(Calendar.MONTH));

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println(calendar.get(Calendar.DATE));
    }
}
