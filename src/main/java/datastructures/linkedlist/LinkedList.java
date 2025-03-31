package datastructures.linkedlist;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class LinkedList {

    /**
     * This class is an implementation detail. It does not need to exist outside this class.
     */
    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        // the list has only one element
        if (head == tail) {
            head = tail = null;
            return;
        }

        // if it comes here then it means the list has more than one element
        var second = head.next;
        head.next = null;
        head = second;
    }

    @Override
    public String toString() {
        if (head == null) return "[]";

        var sj = new StringJoiner(", ", "[", "]");
        Node current = head;
        while (current != null) {
            sj.add(String.valueOf(current.value));
            current = current.next;
        }
        return sj.toString();
    }
}
