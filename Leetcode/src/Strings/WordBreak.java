package Strings;

import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/word-break/description/
 * https://leetcode.com/problems/word-break/solutions/43886/Evolve-from-brute-force-to-optimal-a-review-of-all-solutions/comments/899667
 * ^this soln copied, its insane 
 * memoize found words, iterate through dict and recurse subsequent remainder of string
 */

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        byte[] memo = new byte[s.length()];
        Arrays.fill(memo, (byte) -1);
        
        return wordBreak(s, 0, wordDict, memo);
    }

    public boolean wordBreak(String s, int index, List<String> wordDict, byte[] memo) {
        if(index >= s.length()) return true;

        if(memo[index] != -1) return memo[index] == 1;  //true rep by 1

        byte found = 0;
        for(int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            if(s.startsWith(word, index) && wordBreak(s, index + word.length(), wordDict, memo)) {
                found = 1;
                break;
            }
        }

        memo[index] = found;
        return found == 1;
    }
}
