import java.util.ArrayDeque;
import java.util.Queue;

public class QueueReverse {
    public void reverse(Queue<Integer> queue) {
        Queue<Integer> newQueue = new ArrayDeque<>();
        if (!queue.isEmpty())
            newQueue.add(queue.remove());

        queue = newQueue;
    }
}
