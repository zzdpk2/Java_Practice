package runnable;

public class RunnableEntrance {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();

        Thread t = new Thread(run);

        t.start();

        for (int i = 0; i < 20; i++)
            System.out.println(Thread.currentThread().getName() + "-->" + i);

    }
}
