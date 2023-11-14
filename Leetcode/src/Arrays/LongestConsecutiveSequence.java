package Arrays;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 * Use hash set to store all items, find smallest of each "chain"
 */

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int length  = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                int curr = num;
                while(set.contains(curr + 1)) {
                    curr++;
                }
                length = Math.max(length, curr - num + 1);
            }
        }
        return length;
    }

    /*
     * Alternate solution, expand left and right at same time
     */
    // public int longestConsecutive(int[] nums) {
    //     if(nums == null || nums.length == 0) return 0;
    //     Set<Integer> set = new HashSet<>();
    //     for(int i : nums) set.add(i);
    //     int ans = 0;
    //     for(int num : nums) {
    //         int left = num - 1;
    //         int right = num + 1;
    //         while(set.remove(left)) left--;
    //         while(set.remove(right)) right++;
    //         ans = Math.max(ans,right - left - 1);
    //         if(set.isEmpty()) return ans;//save time if there are items in nums, but no item in hashset.
    //     }
    //     return ans;
    // }
}
