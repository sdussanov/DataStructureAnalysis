import java.util.Stack;

public class StringReverser {
    public StringReverser(String input) {
        System.out.println(this.reverse(input));
    }

    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

}
