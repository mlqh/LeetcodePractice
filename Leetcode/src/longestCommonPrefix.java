public class longestCommonPrefix {

    // mine
    // public String findLongestCommonPrefix(String[] strs) {
    // if (strs.length == 1)
    // return strs[0];
    // int indx = 0;
    // String common = "";
    // char curr;
    // int shortest = -1;

    // for (String str : strs) {
    // if (shortest == -1) {
    // shortest = str.length();
    // } else if (str.length() < shortest) {
    // shortest = str.length();
    // }
    // }

    // for (int i = 0; i < shortest; i++) {
    // curr = strs[0].charAt(indx);
    // for (int j = 1; j < strs.length; j++) {
    // if (strs[j].charAt(indx) != curr) {
    // i = strs[0].length();
    // break;
    // }
    // if (j == strs.length - 1) {
    // common += curr;
    // indx++;
    // }
    // }
    // }
    // return common;
    // }

    /**
     * 
     * Approach 2: Vertical scanning Algorithm
     * 
     * Imagine a very short string is the common prefix at the end of the array. The
     * above approach will still do SS comparisons. One way to optimize this case is
     * to do vertical scanning. We compare characters from top to bottom on the same
     * column (same character index of the strings) before moving on to the next
     * column.
     */

    public String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
