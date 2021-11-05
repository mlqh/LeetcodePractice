import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean isValid(String s) {
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
