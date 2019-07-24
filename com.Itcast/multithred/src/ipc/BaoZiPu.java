package ipc;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
            synchronized (bz){
                if(bz.flag == true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if(count % 2 == 0){
                    bz.pi = "A";
                    bz.xian = "AA";
                }else{
                    bz.pi = "B";
                    bz.xian = "BB";
                }

                count++;
                System.out.println("Producing " + bz.pi + " and " + bz.xian + " Baozi.");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                bz.flag = true;
                bz.notify();
                System.out.println("The Baozi has already been made: " + bz.pi + " and " + bz.xian);

            }
        }
    }
}
