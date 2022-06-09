public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] > min)
                max = Math.max(prices[i] - min, max);
        }
        return max;
    }
}
