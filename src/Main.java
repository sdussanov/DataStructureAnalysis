import java.util.Stack;

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

        String str = "({abcd})";

        StringBalanced sb = new StringBalanced();

        System.out.println(sb.isBalanced(str));

    }
}