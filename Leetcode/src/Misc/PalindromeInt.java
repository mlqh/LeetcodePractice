package Misc;
public class PalindromeInt {
    public static boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0)
            return false;

        int flipped = 0;

        while (x > flipped) {
            flipped = (flipped * 10) + (x % 10);
            x /= 10;
        }

        if (flipped == x || flipped / 10 == x) {
            return true;
        }

        return false;

    }
}
