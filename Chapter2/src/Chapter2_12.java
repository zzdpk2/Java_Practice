import java.util.Scanner;

public class Chapter2_12 {
    public static void main(String[] args) {
        System.out.print("Enter balance and interest rate: ");
        Scanner scanner = new Scanner(System.in);
        String mix_result = scanner.nextLine();
        int space_pos = 0;
        for(int i = 0; i < mix_result.length(); i++){
            if (mix_result.charAt(i) == ' '){
                space_pos = i;
                break;
            }
        }
        double commission = Double.parseDouble(mix_result.substring(0, space_pos - 1));
        double interest_rate = Double.parseDouble(mix_result.substring(space_pos + 1));
        System.out.println("The interest is: " + commission * interest_rate / 1200.0);
    }
}
