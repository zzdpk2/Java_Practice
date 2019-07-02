package stringbuilder;

public class StringBuilder_r {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1: " + bu1);

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2: " + bu2);

        StringBuilder bu3 = bu1.append("abc");

    }
}
