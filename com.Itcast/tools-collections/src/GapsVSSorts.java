import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GapsVSSorts {

    public static void main(String[] args) {

        ArrayList<Integer> list_r = new ArrayList<>();
        Collections.addAll(list_r, 1, 3, 2, 7, 5);
        Collections.sort(list_r);

        Collections.sort(list_r, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
                return o2 - o1;
            }
        });

        System.out.println(list_r);


    }

}
