package stringbuilder;

public class StringBuilder_rr {

    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        StringBuilder bu2 = bu.append("abc");

        // Chain programming
        bu.append(1).append(2).append("abc");

        StringBuilder bu11 = new StringBuilder("assds");
        System.out.println((bu11.toString()) instanceof String);

    }

}
