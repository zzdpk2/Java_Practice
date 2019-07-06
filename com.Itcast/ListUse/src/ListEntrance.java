import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEntrance {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");

        System.out.println(list);
        // add it between c and d
        list.add(3, "aaaa");

        // remove element c
        String removeE = list.remove(2);
        System.out.println("Removed element: " + removeE);

        System.out.println(list);

        String setE = list.set(4, "KKK");
        System.out.println(setE);

        System.out.println(list);

        //traverse list
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("----------------------");

        //traverse by iterator
        Iterator<String> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        //traverse by foreach
        for (String s : list)
            System.out.println(s);


    }
}
