package threadclass;

public class Entrance {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();
        new MyThread().start();

    }
}
