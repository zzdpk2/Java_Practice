import java.util.ArrayList;
import java.util.Iterator;

public class Advance {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");

        Iterator<String> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("ABC");
        list.add(1);

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            // String 特有方法 需要向下转型 but ClassCastException
//            String s = (String)obj;
//            System.out.println(s.length());

        }
    }
}
