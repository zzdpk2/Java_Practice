package ipc;

public class ChiHuo extends Thread{

    private BaoZi bz;

    public ChiHuo(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Chihuo eating BaoZi with " + bz.xian + " and " + bz.pi);
                bz.flag = false;
                bz.notify();
                System.out.println("Chihuo already ate " + bz.xian + " and " + bz.pi + " Baozipu start producing....");
                System.out.println("---------------");
            }
        }
    }
}
