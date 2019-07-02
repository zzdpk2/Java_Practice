package system;

public class SystemPractice {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        demo01();
        long end = System.currentTimeMillis();
        System.out.println("Time is " + (end - start) + " miliseconds.");

    }

    private static void demo01() {
        for (int i = 0; i < 9999; i++)
            System.out.println();
    }
}
