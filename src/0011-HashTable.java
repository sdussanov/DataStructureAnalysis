import java.util.Arrays;
import java.util.LinkedList;

class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" + "key=" + key + ", value='" + value + '\'' + '}';
        }
    }

    private LinkedList<Entry>[] entries;

    public HashTable(int capacity) {
        entries = new LinkedList[capacity];
    }

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).addLast(new Entry(key, value));
    }

    public String get(int key) {
        var entry = getEntry(key);

        return (entry == null) ? null : entry.value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null)
            return bucket;

        return entries[index] = new LinkedList<>();
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);

        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) {
                    return entry;
                }
            }
        }

        return null;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {
        return "HashTable{" + "linkedLists=" + Arrays.toString(entries) + '}';
    }
}
