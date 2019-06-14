import java.util.ArrayList;

public class Admin extends User{

    public Admin(){
    }

    public Admin(String name, double money) {
        super(name, money);
    }

    @Override
    public void show() {

    }

    public ArrayList<Double> send(double money, int count) {
        ArrayList<Double> redList = new ArrayList<>();

        double leftMoney = super.getMoney();
        if (money > leftMoney) {
            System.out.println("No enough money!");
            return null;
        }

        super.setMoney(leftMoney - money);

        for (int i = 0; i < count; i++)
            redList.add(money / count);

        return redList;
    }
}
