package Misc;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
