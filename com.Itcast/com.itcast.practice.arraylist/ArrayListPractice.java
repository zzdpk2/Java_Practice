import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        Person[] array = new Person[3];
//        System.out.println(array[0]);

        Person one = new Person("迪力热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("玛尔扎哈",38);

//        one地址值赋值到array[0]
        array[0] = one;
        array[1] = two;
        array[2] = three;

        ArrayList<Person> list = new ArrayList<>();
        ArrayList<Integer> list_1 = new ArrayList<>();
//        System.out.println(list);
        list.add(one);
        list.add(two);
        list.add(three);

        list_1.add(100);

    }
}
