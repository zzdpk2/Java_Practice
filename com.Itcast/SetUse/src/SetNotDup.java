import java.util.HashSet;

public class SetNotDup {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");

        System.out.println(set);

    }
}
