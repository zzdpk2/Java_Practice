package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectonUse {

    public static void main(String[] args) {
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);

        coll.add("AAAA");
        coll.add("BBBB");
        coll.add("CCCC");
        coll.add("DDDD");

        System.out.println(coll);

        coll.remove("DDDD");
        System.out.println(coll);

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

}
