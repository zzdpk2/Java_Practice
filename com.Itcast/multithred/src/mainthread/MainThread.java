package mainthread;

public class MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        p1.run();

//        Block the only thread(main thread)
//        System.out.println(0/0);

        Person p2 = new Person("B");
        p2.run();
    }
}
