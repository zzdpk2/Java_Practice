package object.tostring;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ToString {

    public static void main(String[] args) {
        Person person = new Person("zhangsan",16);
        System.out.println(person.toString());

        Random random = new Random();
        System.out.println(random);

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

    }



}
