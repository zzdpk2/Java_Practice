package packandunpack;

public class PackAndUnpackString {
    public static void main(String[] args) {
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(10);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        int in1 = Integer.parseInt("100");
        System.out.println(in1);

    }
}