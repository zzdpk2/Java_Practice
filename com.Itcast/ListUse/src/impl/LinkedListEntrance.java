package impl;

import java.util.LinkedList;

public class LinkedListEntrance {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> linkedList = crateData();
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.pop());
    }

    private static void show02() {
        LinkedList<String> linkedList = crateData();

        // Clear the elements inside linkedlist
//        linkedList.clear();
        System.out.println(linkedList.isEmpty());

        String firstE = linkedList.getFirst();
        System.out.println(firstE);

        String lastE = linkedList.getLast();
        System.out.println(lastE);

    }

    private static void show01() {

        LinkedList<String> linkedList = crateData();

        System.out.println(linkedList);

        linkedList.addFirst("WWW");
        linkedList.push("WWW");
        linkedList.addLast("KKK");
        linkedList.add("KKKK");

        System.out.println(linkedList);

    }

    private static LinkedList<String> crateData() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("CCC");
        linkedList.add("DDD");
        linkedList.add("EEE");

        return linkedList;

    }

}
