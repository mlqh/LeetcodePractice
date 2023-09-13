package Strings;
/**
 * With the condiitions 1 <= s.length() <= 2^5
 * Alphanumeric wanted only
 * First, check length
 * Two pointers, iterate front and back
 * If not alphanumeric, skip over
 * When both pointers on alphanumeric, compare lowercase
 * 
 */

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        for (int front = 0, back = s.length() - 1; front < back;) {
            if (!Character.isLetterOrDigit(s.charAt(front))) {
                front++;
            } else if (!Character.isLetterOrDigit(s.charAt(back))) {
                back--;
            } else {
                if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(back))) {
                    return false;
                }
                front++;
                back--;
            }
        }
        return true;
    }
}