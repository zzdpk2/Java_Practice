package HashCode;

public class HashCodeEntrance {

    public static void main(String[] args) {
        Person p1 = new Person();
        int code1 = p1.hashCode();
        System.out.println(code1);

        Person p2 = new Person();
        int code2 = p2.hashCode();
        System.out.println(code2);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
