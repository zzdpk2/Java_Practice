package exception.myexception;

import java.util.Scanner;

public class Practice {

    static String[] usernames = {"aaa","bbb", "ccc"};

    public static void main(String[] args) /*throws RegisterException*/ {
        System.out.println("Please input the username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        checkUsername(username);

    }

    public static void checkUsername(String name) /*throws RegisterException*/{
        for (String username : usernames) {

            if(name.equals(username)){
                try {
                    throw new RegisterException("This username has already been registered!");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
            
        }

        System.out.println("The user has been successfully added!");
    }
}
