package Iterator;

import java.util.ArrayList;

public class ForEach {

    public static void main(String[] args) {
        
        demo01();
        demo02();
        
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        for(String s : list)
            System.out.println(s);
    }

    private static void demo01() {

        int[] arr = {0, 1, 2, 3, 4};
        for(int i: arr)
            System.out.println(i);

    }

}
