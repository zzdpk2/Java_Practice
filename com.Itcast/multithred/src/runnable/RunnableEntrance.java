package runnable;

public class RunnableEntrance {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();

//        Thread t = new Thread(run);
        Thread t2 = new Thread(new RunnableImpl2());

//        t.start();
        t2.start();

        for (int i = 0; i < 20; i++)
            System.out.println(Thread.currentThread().getName() + "-->" + i);

    }
}
