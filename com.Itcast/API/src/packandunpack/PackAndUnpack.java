package packandunpack;

public class PackAndUnpack {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        System.out.println(i1);

        Integer in1 = Integer.valueOf(1);
        System.out.println(in1);

        int i = in1.intValue();
        System.out.println(i);

    }
}
