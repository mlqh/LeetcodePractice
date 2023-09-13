package Strings;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/palindromic-substrings/description/
 * Use "expand around center" actually insane wtf
 * https://www.youtube.com/watch?v=uUCPLEriUMw
 */

public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int n = s.length();
        if(n <= 1) return 1;
        int num = 0;
        char[] c = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            num += expandAroundCenter(c, i, i);
            num += expandAroundCenter(c, i, i + 1);
        }
        return num;
    }

    private static int expandAroundCenter(char[] c, int start, int end) {
        int count = 0;
        while(start >= 0 && end < c.length && c[start--] == c[end++]) count++;
        return count;
    }

    /*
     * My solution, slow af
     */
    // public static int countSubstrings(String s) {
    //     HashSet<String> set = new HashSet<>();
    //     int num = 0;
    //     for(int i = 0; i < s.length(); i++) {
    //         for(int j = i + 1; j <= s.length(); j++) {
    //             String substr = s.substring(i, j);
    //             if(set.contains(substr)) {
    //                 num++;
    //             } else {
    //                 boolean isPal = isPalindrome(substr);
    //                 if(isPal) {
    //                     num++;
    //                     set.add(substr);
    //                 }
    //             }
    //         }
    //     }
    //     return num;
    // }

    // public static boolean isPalindrome(String s) {
    //     if(s.length() <= 1) return true;
    //     for (int i = 0; i < s.length()/2; i++) {
    //         if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
