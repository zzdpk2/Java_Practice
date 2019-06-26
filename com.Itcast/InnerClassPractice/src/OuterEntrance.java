public class OuterEntrance {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
