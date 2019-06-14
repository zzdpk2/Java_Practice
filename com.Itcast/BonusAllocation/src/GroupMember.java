import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends  User{
    public GroupMember() {
    }

    public GroupMember(String name, double money) {
        super(name, money);
    }

    public void receive(ArrayList<Double> list){
        int index = new Random().nextInt(list.size());
        Double delta = list.remove(index);
        double money = super.getMoney();
        super.setMoney(money + delta);
    }

}
