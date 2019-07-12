import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraverseEntry {
    public static void main(String[] args) {
        Map<Integer, String> data = MapUse.createData();
        traverseEntry(data);
    }

    public static void traverseEntry(Map<Integer, String> data) {
        Set<Map.Entry<Integer, String>> entries = data.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey() + ": " + next.getValue());
        }

        System.out.println("=============================");

        for (Map.Entry<Integer, String> entry : entries)
            System.out.println(entry.getKey() + ": " + entry.getValue());

    }
}
