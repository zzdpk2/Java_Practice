import jdk.swing.interop.SwingInterOpUtils;

public class Final /*extends MyClass*/{

    public static void main(String[] args) {

        final int num = 20; // non-changeable variable num

        Student student_1 = new Student("赵丽颖");
        System.out.println(student_1.getName());
        System.out.println(student_1);
        student_1 = new Student("霍建华");
        student_1.getName();
        System.out.println(student_1);

        System.out.println("=================");
        final Student student_2 = new Student("高圆圆");
//        student_2 = new Student("赵又廷");
        student_2.setName("GYYYYYY");
        System.out.println(student_2.getName());

    }

}
