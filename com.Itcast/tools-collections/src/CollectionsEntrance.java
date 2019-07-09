import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEntrance {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        String[] target = {"a", "b", "c", "d", "e"};
//        for (String s : target) list.add(s);

        Collections.addAll(list, "a", "b", "c", "d", "e");
        Collections.shuffle(list);

        ArrayList<Integer> list_r = new ArrayList<>();
        Collections.addAll(list_r, 1, 3, 2, 7, 5);
        Collections.sort(list_r);

        ArrayList<String> list_rr = new ArrayList<>();
        Collections.addAll(list_rr, "a", "c", "k", "b", "e");

        ArrayList<Person> list_p = new ArrayList<>();
        Collections.addAll(list_p, new Person("AAAA", 20),
                new Person("cccc", 18), new Person("LLLL" , 17),
                new Person("BBBB" ,40), new Person("EEEE", 20));

        Collections.sort(list_p);
        System.out.println(list_p);

    }
}
