package Arrays;

/*
 * https://leetcode.com/problems/maximum-ascending-subarray-sum/
 */

public class MaxAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        int prev = nums[0];
        int max = prev;
        int currSum = prev;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev) {
                prev = nums[i];
                currSum += prev;
                max = Math.max(max, currSum);
            } else {
                prev = nums[i];
                currSum = prev;
            }
        }
        return max;
    }
}