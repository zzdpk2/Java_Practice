//import java.util.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUse {

    public static void main(String[] args) {
        show01();
        Map<Integer, String> data = createData();
        Set<Integer> keys = data.keySet();

        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer integer = it.next();
            System.out.println(integer + ": " + data.get(integer));
        }

        System.out.println("====================");

        for(Integer key : data.keySet()){
            String content = data.get(key);
            System.out.println(key + ": " + content);
        }



    }


    public static Map<Integer, String> createData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        return map;
    }

    private static void show01() {
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("A", "1");


    }

}
