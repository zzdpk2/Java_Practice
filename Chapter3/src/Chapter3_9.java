import java.util.Scanner;

public class Chapter3_9 {
    public static void main(String[] args) {
        System.out.println("Please input the first 9 digits of ISBN-10: ");
        Scanner scanner = new Scanner(System.in);
        StringBuffer str_isbn_nine_digts = new StringBuffer(scanner.nextLine());
        scanner.close();
        int error_flag = 0;
        if(str_isbn_nine_digts.length() != 9)
            error_flag = 1;

        for(int i = 0; i < str_isbn_nine_digts.length(); i++){
            if(str_isbn_nine_digts.charAt(i) < 48 || str_isbn_nine_digts.charAt(i) > 57){
                error_flag = 1;
                break;
            }
        }

        if(error_flag == 1){
            System.out.println("The format is not right!");
            System.exit(0);
        }

        int sum = 0;
        for(int i = 0; i < str_isbn_nine_digts.length(); i++)
            sum += (str_isbn_nine_digts.charAt(i) - '0') * (i + 1);

        StringBuffer str_isbn_last_digts;
        if(sum % 11 == 10)
            str_isbn_last_digts = new StringBuffer("X");
        else
            str_isbn_last_digts = new StringBuffer(String.valueOf(sum % 11));

        System.out.println("ISBN-10:" + str_isbn_nine_digts.append(str_isbn_last_digts));

    }

}