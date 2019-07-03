package packandunpack;

import java.util.ArrayList;

public class AutoPackAndUnpack {
    public static void main(String[] args) {
        Integer i1 = 1;
        i1++;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //1 cast from an Integer object, pack list.add(new Integer(1));
        int a = list.get(0); // unpack list.get(0).intValue();

    }
}
