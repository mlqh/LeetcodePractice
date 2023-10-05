package DP;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/climbing-stairs/description/
 */

public class ClimbingStairs {
    Map<Integer, Integer> map = new HashMap<>();

    // memoize
    public int climbStairs(int n) {
        if (n == 1) {
            if (!map.containsKey(n)) map.put(1, 1);
            return 1;
        } else if (n == 2) {
            if (!map.containsKey(n)) map.put(2, 2);
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int result = climbStairs(n - 1) + climbStairs(n - 2);
            if (!map.containsKey(n)) map.put(n, result);
            return result;
        }
    }

    // tabulation
    public int climbStairsTabulation(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
     
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}