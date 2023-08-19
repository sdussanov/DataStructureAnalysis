import java.util.Arrays;

public class ArrayQueue {
    int first;
    int last;
    int[] items = new int[5];

    public void enqueue(int item) {
        if (last >= items.length)
            throw new IllegalStateException();

        for (int i = last; i > 0; i--) {
            items[i] = items[i - 1];
        }

        items[first] = item;
        last++;
    }

    public void deque(int item) {
        if (last >= items.length)
            throw new IllegalStateException();

        items[last++] = item;
    }

    public int peek() {
        if (last == 0)
            throw new IllegalStateException();

        return items[--last];
    }

    public boolean isEmpty() {
        return last == 0;
    }

    public boolean isFull() {
        return last == items.length;
    }

    @Override
    public String toString() {
        var result = Arrays.copyOfRange(items, 0, last);
        return Arrays.toString(result);
    }
}
