package Misc;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/contains-duplicate/description/
 */

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}