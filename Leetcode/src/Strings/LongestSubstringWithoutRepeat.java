package Strings;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Use sliding window, reset left to after repeated char
 */

public class LongestSubstringWithoutRepeat {
//     public int lengthOfLongestSubstring(String s) {
//         int slength = s.length();
//         if(slength <= 1) return slength;
//         Set<Character> set = new HashSet<>();
//         int length = 0;
//         int left = 0;

//         for(int right = 0; right < slength; right++) {
//             if(!set.contains(s.charAt(right))) {
//                 set.add(s.charAt(right));
//                 length = Math.max(length, right - left);
//             } else {
//                 while(s.charAt(left) != s.charAt(right)) {
//                     set.remove(s.charAt(left));
//                     left++;
//                 }
//                 left++;            
//             }
//         }
//         return length + 1;
//     }
// }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int right = 0, left = 0; right < s.length(); right++) {
            int index = s.indexOf(s.charAt(right), left);
            if(index != right) left = index + 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
