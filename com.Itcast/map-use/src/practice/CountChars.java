package practice;

import java.util.HashMap;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : next.toCharArray()) {
            if(map.containsKey(c))  map.put(c, map.get(c) + 1);
            else    map.put(c, 1);
        }

        System.out.println(map);

    }


}
