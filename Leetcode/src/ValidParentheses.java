import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> open = new Stack<>();
        String openBrackets = "({[";
        String closeBrackets = ")}]";

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(openBrackets.indexOf(curr) >= 0) {
                open.push(Character.valueOf(curr));
            } else {
                if(open.empty()) return false;
                
                char temp = (char) (open.peek());
                if(openBrackets.indexOf(temp) == closeBrackets.indexOf(curr)) {
                    open.pop();
                } else {
                    return false;
                }
            }
        }
        if(!open.empty()) {
            return false;
        }

        return true;
    }
    
}

/**
 * First check if string is even length
 * Then, use a stack, push open brackets onto stack
 * When encountering a closed bracket, check to see if matching open is on top of stack
 * 
 * Another solution: for every open bracket encountered, push matching close bracket onto stack
 * When encountering close bracket, check to see if matches top of stack, if not, or if stack empty false
 */