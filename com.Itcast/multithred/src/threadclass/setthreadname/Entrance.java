package threadclass.setthreadname;

public class Entrance {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("AAA");
        mt.start();

        new MyThread("CH").start();

    }
}
