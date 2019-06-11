import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {

    public static void main(String[] args) {
        Random random = new Random();
        int real_random = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            real_random = random.nextInt(33) + 1;
            list.add(real_random);
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }


}
