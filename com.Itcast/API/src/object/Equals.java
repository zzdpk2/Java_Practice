package object;

import java.util.ArrayList;

public class Equals {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Person p1 = new Person("123",123);
        Person p2 = new Person("123",123);
        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
