package threadsafety.synchronizedmethod;

public class TestEntrance {
    public static void main(String[] args) {

        RunnableImpl2 runnable = new RunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
