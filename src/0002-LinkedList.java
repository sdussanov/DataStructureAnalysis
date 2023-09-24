import java.util.NoSuchElementException;

class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            last = getPrevious(last);
            last.next = null;
        }

        size--;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int size() {
        return size;
    }

    public void reverce() {
        if (isEmpty()) return;

        var prev = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = prev;
    }

    public int getKthFromEnd(int k) {
        if (isEmpty()) throw new IllegalStateException();
        if (k > size) throw new IllegalArgumentException();

        var head = first;
        var tail = first;

        for (int i = 0; i < k - 1; i++) {
            head = head.next;
        }

        while (head != last) {
            head = head.next;
            tail = tail.next;
        }
        return tail.value;
    }

    public int getKthFromEnd2(int k) {
        if (isEmpty()) throw new IllegalStateException();
        if (k > size) throw new IllegalArgumentException();

        var head = first;
        var tail = first;
        var count = 0;

        while (head != last) {
            head = head.next;
            count++;
            if (count >= k) {
                tail = tail.next;
            }
        }
        return tail.value;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        var current = first;

        while (current != null) {
            if (current.next == node) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }
}

class Node {
    private int value;
    private Node next;
}