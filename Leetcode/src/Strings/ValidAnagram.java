package Strings;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] freqCount = new int[26];
        for(char letter: s.toCharArray()) {
            freqCount[letter-'a']++;
        }
        for(char letter: t.toCharArray()) {
            freqCount[letter-'a']--;
        }
        for(int i=0;i<26;i++) {
            if(freqCount[i] != 0) {
                return false;
            } 
        }
        return true;
    }
}
