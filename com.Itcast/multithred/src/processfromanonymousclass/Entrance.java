package processfromanonymousclass;

public class Entrance {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++)
                    System.out.println(Thread.currentThread().getName() + "-->" + " pc");
            }
        }.start();

//        Runnable r = new Runnable(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++)
//                    System.out.println(Thread.currentThread().getName() + "-->" + " pc2");
//            }
//        };
//        new Thread(r).start();

        // Simplify
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++)
                    System.out.println(Thread.currentThread().getName() + "-->" + " pc2");
            }
        }).start();
    }
}
