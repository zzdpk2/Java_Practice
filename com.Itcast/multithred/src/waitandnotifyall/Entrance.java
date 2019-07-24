package waitandnotifyall;

public class Entrance {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("C1: Types and Quantities: ");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("C1: Complete, eat it!");
                        System.out.println("-----------------");
                    }
                }
            }
        }.start();

//        new Thread(){
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    synchronized (obj) {
//                        System.out.println("C1: 5S complete! ");
//                        obj.notify();
//                    }
//                }
//            }
//        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("C2: Types and Quantities: ");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("C2: Complete, eat it!");
                        System.out.println("-----------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("C2: 5S complete! ");
//                        obj.notify();
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
