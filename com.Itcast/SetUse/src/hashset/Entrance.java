package hashset;

import java.util.HashSet;

public class Entrance {
    public static void main(String[] args) {
        HashSet<Person> set = createData();
        System.out.println(set);
    }

    private static HashSet<Person> createData() {

        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("A",19);
        Person p2 = new Person("A", 19);
        Person p3 = new Person("A",21);

//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p3.hashCode());

        set.add(p1);
        set.add(p2);
        set.add(p3);

        return set;

    }
}
