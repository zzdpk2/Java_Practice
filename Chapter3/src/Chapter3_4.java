import java.util.Scanner;

public class Chapter3_4 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        int sum = number1 + number2;
        System.out.println(" Enter the sum of the two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println((input == sum) ? "TRUE" : "FALSE! The real number is " + sum + ".");

    }
}
