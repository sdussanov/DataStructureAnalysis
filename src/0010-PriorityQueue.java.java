import java.util.Arrays;

class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if (isFull()) {
            throw new IllegalStateException(); //Or resize our array
        }

        var i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return i + 1;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        var output = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(output);
    }
}
