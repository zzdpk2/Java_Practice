package threadsafety;

public class TestEntrance {
    public static void main(String[] args) {

        RunnableImpl runnable = new RunnableImpl();
        Thread thread01 = new Thread(runnable);
        Thread thread02 = new Thread(runnable);
        Thread thread03 = new Thread(runnable);
        thread01.start();
        thread02.start();
        thread03.start();

    }
}
