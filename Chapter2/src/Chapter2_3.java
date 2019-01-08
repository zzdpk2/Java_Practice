import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Chapter2_3 {
    public static void main(String[] args) {
        String money_str = JOptionPane.showInputDialog(null, "Please input the money: " , "Money Summary", JOptionPane.QUESTION_MESSAGE);
        String gratitude_str = JOptionPane.showInputDialog(null, "Please input the gratitude rate(%): " , "Money Summary", JOptionPane.QUESTION_MESSAGE);
        double money = Double.parseDouble(money_str);
        double gratitude = Double.parseDouble(gratitude_str) / 100.000;
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        JOptionPane.showMessageDialog(null, "Gratitude is " + decimalFormat.format(money * gratitude) + "\n" + "Total Money is " + decimalFormat.format(money * (1.00 + gratitude)));
    }
}
