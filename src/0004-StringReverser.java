import java.util.Stack;

class StringReverser {
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
