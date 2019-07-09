import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GapsVSSorts {

    public static void main(String[] args) {

        ArrayList<Integer> list_r = new ArrayList<>();
        Collections.addAll(list_r, 1, 3, 2, 7, 5);
        Collections.sort(list_r);

        Collections.sort(list_r, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
                return o2 - o1;
            }
        });

//        System.out.println(list_r);

        ArrayList<Student> list_stu = new ArrayList<>();
        Collections.addAll(list_stu,
                new Student("a迪丽热巴", 20 ),
                new Student("古力娜扎", 18),
                new Student("杨幂", 17),
                new Student("辛芷蕾", 33),
                new Student("b辛芷蕾",20));

//        Collections.sort(list_stu, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // Ascend order via age
////                return o1.getAge() - o2.getAge();
//                // Descend order via age
//                return o2.getAge() - o1.getAge();
//            }
//        });

        Collections.sort(list_stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // Ascend order via age
                int result = o1.getAge() - o2.getAge();
                // If their ages are the same, compare via the first letter
                if(result == 0) return o1.getName().charAt(0) - o2.getName().charAt(0);
                return result;
            }
        });

    }

}
