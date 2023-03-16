package DP;

public class FibonacciSum {
    /*
     * Given input number n, return nth fibonacci number 
     * https://leetcode.com/problems/fibonacci-number/description/
     */
    public static int fibonacci(int num) {
        int[] dp = new int[num + 1];
        for(int i = 0; i < num + 1; i++) {
            dp[i] = -1;
        }
        return helper(num, dp);
    }

    public static int helper(int num, int[] dp) {
        if(num == 0) return 0;
        if(num == 1) return 1;
        if(dp[num] != -1) {
            return dp[num];
        }
        dp[num] = helper(num - 1, dp) + helper(num - 2, dp);
        return dp[num];
    }
}
