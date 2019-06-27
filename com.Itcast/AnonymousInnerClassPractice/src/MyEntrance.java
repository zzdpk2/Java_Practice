public class MyEntrance {
    public static void main(String[] args) {
//        MyInterfaceImpl impl = new MyInterfaceImpl();
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        MyInterface obj = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("method1 nested in anonymous class is executed!");
            }

            public void method2() {
                System.out.println("method2 nested in anonymous class is executed!");
            }
        };

        obj.method1();
        obj.method2();

    }
}
