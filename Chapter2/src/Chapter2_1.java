import javax.swing.JOptionPane;
public class Chapter2_1 {
    public static void main(String[] args) {
        String celsius_str = JOptionPane.showInputDialog(null, "Enter a degree in Celsius", "Celsius convert to Fahrenheit", JOptionPane.QUESTION_MESSAGE);
        double celsius = Double.parseDouble(celsius_str);
        JOptionPane.showMessageDialog(null, celsius_str + " Celsius is " + ((9/5.0) * celsius + 32.0) + " Fahrenheit!");
    }
}
