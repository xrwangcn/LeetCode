import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Java020 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> popMap = new HashMap<>();
        popMap.put(']', '[');
        popMap.put(')', '(');
        popMap.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            char peek = stack.empty() ? ' ' : stack.peek();
            if (popMap.get(s.charAt(i)) != null && peek == popMap.get(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }

    //"()"
    //"()[]{}"
    //"(]"
    //"([)]"
    //"{[]}"
    //"(])"
    public static void main(String[] args) {
        boolean result = isValid("(");
        System.out.println(result);
    }
}
