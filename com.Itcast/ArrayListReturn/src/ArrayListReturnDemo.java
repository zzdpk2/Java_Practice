import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturnDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = build();
        System.out.println(arrayList);
        System.out.println(Restructure(arrayList));
    }

    public static ArrayList<Integer> build(){
        final int COUNT = 20;
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int num = 0;
        for (int i = 0; i < COUNT; i++) {
            num = random.nextInt(101);
            list.add(num);
        }
        return list;
    }

    public static ArrayList<Integer> Restructure(ArrayList<Integer> list){
        ArrayList<Integer> evenlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0)
                evenlist.add(list.get(i));
        }
        return evenlist;
    }
}
