package practice1;

import java.util.Arrays;
import java.util.Comparator;

public class Entrance {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("A", 28),
                new Person("B", 30),
                new Person("C", 20)
        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Arrays.sort(arr, (Person o1, Person o2)->{
//            return o1.getAge()-o2.getAge();
//        });

        Arrays.sort(arr, (o1, o2)-> o1.getAge() - o2.getAge());

        for (Person person : arr) { System.out.println(person); }
    }
}
