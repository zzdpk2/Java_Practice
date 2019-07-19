package threadsafety.synchronizedkeyword;

public class RunnableImpl1 implements Runnable{

    private int tickets = 100;

    Object obj = new Object();

    @Override
    public void run() {

        while(true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "--> Selling No." + tickets + " Ticket.");
                    tickets--;
                }
            }
        }

    }
}
