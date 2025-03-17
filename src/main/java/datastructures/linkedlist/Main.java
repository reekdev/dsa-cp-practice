package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println(list.contains(1));
        list.removeFirst();
        System.out.println(list);
    }
}
