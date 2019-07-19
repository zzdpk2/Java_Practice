package threadsafety.lockandunlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl4 implements Runnable{

    private static int tickets = 100;

//    Object obj = new Object();
    Lock l = new ReentrantLock();

    @Override
    public void run() {

        while(true) {
            l.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "--> Selling No." + tickets + " Ticket.");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();
                }

            }

        }

    }

}
