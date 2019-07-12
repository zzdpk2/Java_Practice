
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraverseIterator {

    public static void main(String[] args) {
        Map<Integer, String> data = MapUse.createData();
        traverseIterator(data);
    }

    public static void traverseIterator(Map<Integer, String> data) {
        Set<Integer> set = data.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next + ": " + data.get(next));
        }
    }

}
