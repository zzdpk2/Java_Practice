package linkedhashset;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCode {

    public static void main(String[] args) {
        LinkedHashSet<String> set = createData();
        System.out.println(set);

    }

    private static LinkedHashSet<String> createData() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        return set;
    }


}
