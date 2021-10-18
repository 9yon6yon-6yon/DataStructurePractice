package Queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int size) {
        items = new int[size];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear+1) % items.length;//this is to make the queue circular
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front+1) % items.length;//this is to make the queue circular
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }


}
