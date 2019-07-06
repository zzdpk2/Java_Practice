package impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VectorEntrance {
    public static void main(String[] args) {
        int set_size = 10;
        Set<Integer> dataSet = createData(set_size);
        Iterator<Integer> it = dataSet.iterator();

        // Traverse by Iterator
        while(it.hasNext()) System.out.println(it.next());

        System.out.println("-----------------------------");

        // Traverse by foreach
        for (Integer i : dataSet)   System.out.println(i);

    }

    private static Set<Integer> createData(int set_size) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < set_size; i++)
            set.add(i);
        return set;
    }
}
