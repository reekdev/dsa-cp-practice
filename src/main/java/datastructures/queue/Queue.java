package datastructures.queue;

import java.util.Arrays;

public class Queue {
    private int[] items;
    private int rear;
    private int front;
    private int count;

    public Queue(int capacity) {
        items = new int[capacity];
    }

    public void enqeue(int item) {
        if (count == items.length)
            throw new IllegalStateException("Queue is full");
        items[rear++] = item;
        ++count;
    }

    public int dequeue() {
        var item = items[front];
        items[front++] = 0;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
