import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        System.out.println(numbers.indexOf(5));
//        numbers.print();

//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//
//        System.out.println(list.getKthFromEnd(-1));

//        String str = "({abcd})";
//
//        StringBalanced sb = new StringBalanced();
//
//        System.out.println(sb.isBalanced(str));
//
//        CustomStack stack = new CustomStack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.toString());

        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.deque());
        System.out.println(queue.toString());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);


        System.out.println(queue.deque());
        System.out.println(queue.toString());
    }


}