import java.util.Arrays;
import java.util.Stack;

public class StringBalanced {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty())
                    return false;

                var left = stack.pop();
                if (!isBracketsMatch(left, ch)) return false;
            }
        }


        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return ch == '{' || ch == '<' || ch == '[' || ch == '(';
    }

    private boolean isRightBracket(char ch) {
        return ch == '}' || ch == '>' || ch == ']' || ch == ')';
    }

    private boolean isBracketsMatch(char left, char right) {
        switch (left) {
            case '}':
                if (right != '{')
                    return false;
            case '>':
                if (right != '<')
                    return false;
            case ']':
                if (right != '[')
                    return false;
            case ')':
                if (right != '(')
                    return false;
            default:
                return true;
        }
    }
}
