import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Entrance {

    List<String> types = List.of("♠", "♥", "♣", "♦");
    List<String> names = List.of("2",
            "A", "K", "Q", "J", "10",
            "9", "8", "7", "6", "5", "4", "3");
    List<String> names_s = List.of("Joker", "Little Joker");

    public Entrance() {
    }

    public Entrance(List<String> types, List<String> names, List<String> names_s) {
        this.types = types;
        this.names = names;
        this.names_s = names_s;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getNames_s() {
        return names_s;
    }

    public void setNames_s(List<String> names_s) {
        this.names_s = names_s;
    }



    public static void main(String[] args) {
        createData();
        shuffleData();
        deliver();
        sortData();
        check();
    }

    public static void createData() {

        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        int index = 0;

        for (String names_ : names_s) {
            poker.put(index, names_s.get(index));
            pokerIndex.add(index);
            index++;
        }

        for (String name : names) {
            for (String type : types) {
                poker.put(index, type + name);
                pokerIndex.add(index);
                index++;
            }
        }


//        System.out.println(poker);
//        System.out.println(pokerIndex);

    }

    private static void shuffleData() {

    }

    private static void deliver() {

    }

    private static void sortData() {

    }

    private static void check() {
    }

}
