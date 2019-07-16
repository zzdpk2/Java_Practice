package threadclass;

public class MyThread extends Thread{

    @Override
    public void run(){
//        String name = getName();
//        System.out.println(name);
//        Thread thread = Thread.currentThread();
//        System.out.println(thread);
//
//        String name = thread.getName();
//        System.out.println(name);

        System.out.println(Thread.currentThread().getName());

    }

}
