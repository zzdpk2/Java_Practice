package threadsafety;

public class RunnableImpl implements Runnable{

    private int tickets = 100;

    @Override
    public void run() {

        while(true) {
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
