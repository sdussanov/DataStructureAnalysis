import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        System.out.println(numbers.indexOf(5));
//        numbers.print();

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.removeLast();

        System.out.println(list.indexOf(40));
        System.out.println(list.contains(40));

        int[] array = list.toArray();

        System.out.println(Arrays.toString(array));
    }
}