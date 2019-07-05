public class GenericMethodEntrance {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method1(10);
        gm.method1("abc");
        gm.method1(true);

        gm.method2("Static method!");
    }
}
