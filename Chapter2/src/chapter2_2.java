import java.text.DecimalFormat;
import java.util.Scanner;
public class chapter2_2 {
    public static void main(String[] args) {
        System.out.print("Enter the radius of a cylinder: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        scanner.reset();
        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();
        scanner.close();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println("The area is " + decimalFormat.format(2 * radius * Math.PI * length + Math.PI * radius * radius * 2));
        System.out.println("The volume is " + decimalFormat.format(Math.PI * radius * radius * length));
    }
}
