package person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSavesPerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        HashMap<Person, String> map = createData_r();
        traverse_r(map);
    }

    private static void show01() {

        HashMap<Integer, Person> map = createData();
        traverse(map);

    }

    public static HashMap<Person, String> createData_r() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("a", 1), "aa");
        map.put(new Person("b", 2), "bb");
        map.put(new Person("c", 3), "cc");
        map.put(new Person("a", 1), "dd");
        return map;
    }

    public static HashMap<Integer, Person> createData() {
        HashMap<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("a", 1));
        map.put(2, new Person("b", 2));
        map.put(3, new Person("c", 3));
        map.put(4, new Person("d", 4));
        return map;
    }

    public static void traverse_r(HashMap<Person, String> map){
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries)
            System.out.println(entry.getKey() +  ": " + entry.getValue());

    }

    public static void traverse(HashMap<Integer, Person> map){
        Set<Map.Entry<Integer, Person>> entries = map.entrySet();
        for (Map.Entry<Integer, Person> entry : entries)
            System.out.println(entry.getKey() + ": " + entry.getValue());

    }

}
