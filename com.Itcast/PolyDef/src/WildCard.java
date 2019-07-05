import java.util.ArrayList;
import java.util.Collection;
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

        // Polymorphism restrictions
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement(list1);
//        getElement(list2);
        getElement(list3);
//        getElement(list4);

//        getElement2(list1);
//        getElement2(list2);
        getElement2(list3);
        getElement2(list4);

    }

    private static void getElement(Collection<? extends Number> coll) {
    }

    public static void getElement2(Collection<? super Number> coll) {

    }

    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

}
