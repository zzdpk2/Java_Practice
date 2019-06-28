package InterfaceAsVars;

import java.util.ArrayList;
import java.util.List;

public class InterfaceEntrance {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        return list;
    }
}
