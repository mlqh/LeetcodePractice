package Arrays;

/*
 * https://leetcode.com/problems/maximum-subarray/
 * Below is Kadane's algorithm
 * Also can use DP, uses slightly less memory
 * https://leetcode.com/problems/maximum-subarray/solutions/1595195/c-python-7-simple-solutions-w-explanation-brute-force-dp-kadane-divide-conquer/
 * https://leetcode.com/problems/maximum-subarray/solutions/20193/dp-solution-some-thoughts/
 */

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currSum < 0) {
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }
            max = Math.max(max, currSum);
        }
        return max;
    }

    public int maxSubArrayDP(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
