import java.util.Stack;
import java.util.Queue;

class QueueReverse {
    public Queue<Integer> reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}
