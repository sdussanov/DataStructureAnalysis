import java.util.Arrays;

class Stack {
    private int[] items = new int[5];
    int count;

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public int peek() {
        return items[count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var output = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(output);
    }
}