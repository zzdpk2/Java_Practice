package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorUse {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Yaoming0");
        coll.add("Yaoming1");
        coll.add("Yaoming2");
        coll.add("Yaoming3");
        coll.add("Yaoming4");

        Iterator<String> it = coll.iterator();
//        it.hasNext();
//        String s = it.next();

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("====================");

        for(Iterator<String> it2 = coll.iterator();it2.hasNext();)
            System.out.println(it.next());
    }
}
