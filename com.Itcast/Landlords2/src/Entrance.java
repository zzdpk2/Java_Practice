import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Entrance {

    static List<String> types = List.of("♠", "♥", "♣", "♦");
    static List<String> names = List.of("2",
            "A", "K", "Q", "J", "10",
            "9", "8", "7", "6", "5", "4", "3");
    static List<String> names_s = List.of("Joker", "Little Joker");

    public Entrance() {
    }

    public Entrance(List<String> types, List<String> names, List<String> names_s) {
        this.types = types;
        this.names = names;
        this.names_s = names_s;
    }

    public static List<String> getTypes() {
        return types;
    }

    public static void setTypes(List<String> types) {
        Entrance.types = types;
    }

    public static List<String> getNames() {
        return names;
    }

    public static void setNames(List<String> names) {
        Entrance.names = names;
    }

    public static List<String> getNames_s() {
        return names_s;
    }

    public static void setNames_s(List<String> names_s) {
        Entrance.names_s = names_s;
    }

    public static void main(String[] args) {
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

        Collections.shuffle(pokerIndex);

        ArrayList<Integer> players01 = new ArrayList<>();
        ArrayList<Integer> players02 = new ArrayList<>();
        ArrayList<Integer> players03 = new ArrayList<>();
        ArrayList<Integer> jokers = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            if(i >= 51) jokers.add(pokerIndex.get(i));
            else if(i % 3 == 0)  players01.add(pokerIndex.get(i));
            else if(i % 3 == 1)  players02.add(pokerIndex.get(i));
            else if(i % 3 == 2)  players03.add(pokerIndex.get(i));
        }

        Collections.sort(players01);
        Collections.sort(players02);
        Collections.sort(players03);
        Collections.sort(jokers);

        check(poker, players01);
        check(poker, players02);
        check(poker, players03);
        check(poker, jokers);

    }

    private static void check(HashMap<Integer, String> pokerDic, ArrayList<Integer> list) {

        System.out.println("Player: ");
        for (Integer key : list)
            System.out.println(pokerDic.get(key));

        System.out.println();
    }

}
