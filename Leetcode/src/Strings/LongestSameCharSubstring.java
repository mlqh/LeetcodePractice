package Strings;
public class LongestSameCharSubstring {
    public int maxPower(String s) {
        if (s.length() == 1)
            return 1;
        char curr = s.charAt(0);
        int maxPower = 1;
        int currPower = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                currPower++;
                if (currPower > maxPower) {
                    maxPower = currPower;
                }
            } else {
                curr = s.charAt(i);
                currPower = 1;
            }
        }
        return maxPower;
    }
}
