public class GenericInterfaceEntrance {
    public static void main(String[] args) {
        GenericInterfaceImpl gi1 = new GenericInterfaceImpl();
        gi1.method("aaa");

        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(1);

    }
}
