import java.util.Scanner;

public class chapter2_8 {
    public static void main(String[] args) {
        System.out.println("Please enter an ASCII code: ");
        Scanner scanner = new Scanner(System.in);
        int ASCII_code = scanner.nextInt();
        System.out.println("The character for ASCII code " + ASCII_code + " is " + ((char)ASCII_code));
    }
}
