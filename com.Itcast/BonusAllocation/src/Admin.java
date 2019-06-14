import java.util.ArrayList;

public class Admin extends User{

    public Admin(){
    }

    public Admin(String name, double money) {
        super(name, money);
    }

    public ArrayList<Double> send(double money, int count) {
        ArrayList<Double> redList = new ArrayList<>();

        double leftMoney = super.getMoney();
        if (money > leftMoney) {
            System.out.println("No enough money!");
            return null;
        }

//        System.out.println(this);
        super.setMoney(leftMoney - money);

        for (int i = 0; i < count; i++)
            redList.add(money / count);

        return redList;
    }
}
