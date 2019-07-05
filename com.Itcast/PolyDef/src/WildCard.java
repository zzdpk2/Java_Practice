import java.util.ArrayList;
import java.util.Iterator;

public class WildCard {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("A");
        list02.add("B");

//        wrong
//        ArrayList<?> list = new ArrayList<>();
    }

    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

}
