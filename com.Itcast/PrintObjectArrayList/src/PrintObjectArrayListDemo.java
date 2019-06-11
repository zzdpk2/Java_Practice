import java.util.ArrayList;

public class PrintObjectArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        ArrayListPrint(list);

    }

    public static void ArrayListPrint(ArrayList<String> list){
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i == list.size() - 1)
                System.out.print(" }");
            else
                System.out.print(" @ ");
        }
    }
}
