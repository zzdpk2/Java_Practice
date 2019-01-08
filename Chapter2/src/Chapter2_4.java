import java.util.Scanner;

public class Chapter2_4 {
    public static void main(String[] args) {
        System.out.println("Please enter a integer between 0 and 1000: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int d1 = number / 100;
        int d2 = (number /10) % 10;
        int d3 = number % 100 % 10;
        System.out.println("The sum of digits is " + (d1 + d2 + d3));
    }
}
