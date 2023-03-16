package Misc;
import java.util.Deque;
import java.util.ArrayDeque;

/*
 * https://leetcode.com/problems/valid-parentheses/description/
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Deque<Character> stack = new ArrayDeque<>();
        char c, popped;
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.addFirst(s.charAt(i));
            } else {
                if(stack.size() == 0) return false;
                popped = stack.removeFirst();
                switch (s.charAt(i)) {
                    case ')':
                        if(popped != '(') return false;
                        break;
                    case '}':
                        if(popped != '{') return false;
                        break;
                    case ']':
                        if(popped != '[') return false;
                        break;
                }
            }
        }
        return stack.size() == 0;
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