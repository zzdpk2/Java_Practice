import java.util.Scanner;
public class Chapter2_7 {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes: ");
        Scanner scanner = new Scanner(System.in);
        int sum_minutes = scanner.nextInt();
        System.out.println(sum_minutes + " is approximately " + (sum_minutes / 60 / 24 / 365) + " years and " + (sum_minutes / 60 / 24 % 365) + " days.");
    }
}
