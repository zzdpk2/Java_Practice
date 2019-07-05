import java.util.ArrayList;
import java.util.Collections;

public class LandlordsEntrance {
    public static void main(String[] args) {
        //1. prepare
        // Define an arraylist with String type
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10",
                "9", "8", "7", "6", "5", "4", "3"};
        poker.add("Joker");
        poker.add("Little Joker");

        for(String number : numbers){
            for (String color : colors) {
//                System.out.println(color + number);
                poker.add(color + number);
            }
        }

//        System.out.println(poker);

        // 2. shuffle the pokers
        Collections.shuffle(poker);

        // 3. deliver the pokers
//        ArrayList<ArrayList<String>> player = new ArrayList<ArrayList<String>>();
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> JOKERS = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i >= 51)
                JOKERS.add(p);
            else if(i % 3 == 0)
                player01.add(p);
            else if(i % 3 == 1)
                player02.add(p);
            else if(i % 3 == 2)
                player03.add(p);
        }

//        4. Check
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(JOKERS);

    }
}
