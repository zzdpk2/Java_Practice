package linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapEntrance {

    public static void main(String[] args) {
        HashMap<String, String> map = createData();
        LinkedHashMap<String, String> map1 = createData_r();
    }

    public static LinkedHashMap<String, String> createData_r() {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");

        System.out.println(map);

        return map;
    }

    public static HashMap<String, String> createData() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);
        return map;
    }




}
