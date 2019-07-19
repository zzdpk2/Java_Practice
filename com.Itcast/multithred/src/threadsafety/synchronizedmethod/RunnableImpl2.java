package threadsafety.synchronizedmethod;

public class RunnableImpl2 implements Runnable{

    private int tickets = 100;

    Object obj = new Object();

    @Override
    public void run() {

        while(true) {
            payTicket();
        }

    }

    public synchronized void payTicket(){
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
