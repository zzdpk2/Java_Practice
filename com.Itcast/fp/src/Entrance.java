public class Entrance {
    public static void main(String[] args) {
//        RunnableImpl run = new RunnableImpl();
//        Thread t = new Thread(run);
//        t.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "new Thread created!");
//            }
//        }).start();

//        new Thread(() -> {
//                System.out.println(Thread.currentThread().getName() + "new Thread created!");
//            }
//        ).start();

        new Thread(() ->
            System.out.println(Thread.currentThread().getName() + "new Thread created!")
        ).start();

    }
}
