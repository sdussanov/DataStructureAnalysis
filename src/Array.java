public class Array {
    private int count;
    private int[] items;

    public Array(int length) {
        items = new int[length];
        count = 0;
    }

    public void insert(int item) {
        if (count >= items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("out of range");
        }
        for (int i = index; i < count; i++) {
                items[i] = items[i + 1];
        }
        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
