package threadsafety.synchronizedstatic;

public class RunnableImpl3 implements Runnable{

    private static int tickets = 100;

    Object obj = new Object();

    @Override
    public void run() {

        while(true) {
            payTicket();
        }

    }

    public static synchronized void payTicket(){
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
