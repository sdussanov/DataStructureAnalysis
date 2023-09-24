import java.util.Arrays;

class ArrayQueue {
    int[] items;
    int front;
    int rear;
    int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int deque() {
        if (rear == 0)
            throw new IllegalStateException();

        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek() {
        if (rear == 0)
            throw new IllegalStateException();

        return items[--rear];
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public boolean isFull() {
        return rear == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
