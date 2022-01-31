import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> open = new Stack<>();
        String openBrackets = "({[";
        String closeBrackets = ")}]";

        for (char i : s.toCharArray()) {
            if (openBrackets.indexOf(i) != -1) {
                open.push(i);
            } else {
                if (open.empty())
                    return false;
                if (openBrackets.indexOf(open.peek()) == closeBrackets.indexOf(i)) {
                    open.pop();
                } else {
                    return false;
                }
            }
        }
        return open.isEmpty();
    }

}

/**
 * First check if string is even length
 * Then, use a stack, push open brackets onto stack
 * When encountering a closed bracket, check to see if matching open is on top
 * of stack
 * 
 * Another solution: for every open bracket encountered, push matching close
 * bracket onto stack
 * When encountering close bracket, check to see if matches top of stack, if
 * not, or if stack empty false
 */