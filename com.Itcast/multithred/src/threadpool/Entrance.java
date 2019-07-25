package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Entrance {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
//        es.shutdown();
    }
}
