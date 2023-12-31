import java.util.Queue;
import java.util.LinkedList;

class StackWithTwoQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;

    public StackWithTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
        top = x;
    }

    public int pop() {
        while (queue1.size() > 1) {
            top = queue1.poll();
            queue2.offer(top);
        }
        int result = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return result;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        return "StackWithTwoQueues{" +
                "queue1=" + queue1 +
                ", queue2=" + queue2 +
                '}';
    }
}