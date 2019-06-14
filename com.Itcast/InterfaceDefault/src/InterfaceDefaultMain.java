public class InterfaceDefaultMain {
    public static void main(String[] args) {
        InterfaceDefaultA a = new InterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();

        System.out.println("================");
        InterfaceDefaultB b = new InterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();

    }
}
