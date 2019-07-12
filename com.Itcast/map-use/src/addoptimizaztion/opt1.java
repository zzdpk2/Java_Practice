package addoptimizaztion;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class opt1 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list);
//        list.add("f");
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);

        Map<String, Integer> map = Map.of("a", 19, "b", 20);
        System.out.println(map);

    }
}
