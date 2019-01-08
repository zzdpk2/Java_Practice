import javax.swing.JOptionPane;

public class Chapter2_10 {
    public static void main(String[] args) {

        String amount_str = JOptionPane.showInputDialog(null, "Please enter an amount in integer, for example 1156", "ComputeChange", JOptionPane.QUESTION_MESSAGE);
        int amount = Integer.parseInt(amount_str);
        int numOfOneDollars = amount / 100;
        amount = amount % 100;

        // Find the number of quarters in the remaining amount
        int numOfQuarters = amount / 25;
        amount = amount % 25;

        // Find the number of dimes in the remaining amount
        int numOfDimes = amount / 10;
        amount = amount % 10;

        // Find the number of nickels in the remaining amount
        int numOfNickels = amount / 5;
        amount = amount % 5;

        // Find the number of pennies in the remaining amount
        int numOfPennies = amount;

        // Display results
        JOptionPane.showMessageDialog(null, "Your amount " + Integer.parseInt(amount_str) + " consists of \n" +
                        numOfOneDollars + "\t dollars\n" +
                        numOfQuarters + "\t quarters\n" +
                        numOfDimes + "\t dimes\n" +
                        numOfNickels + "\t nickels\n" +
                        numOfPennies + "\t pennies",
                "Result", JOptionPane.INFORMATION_MESSAGE);

    }
}
