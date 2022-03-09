public class BuyAndSell {
    // public static int maxProfit(int[] prices) {
    // int minIndex = 0;
    // int maxIndex = prices.length - 1;
    // int minPrice = prices[minIndex];
    // int maxPrice = prices[maxIndex];
    // int maxProfit = maxPrice - minPrice;
    // do {
    // if (prices[minIndex] < minPrice) {
    // minPrice = prices[minIndex];
    // maxProfit = maxPrice - minPrice;
    // } else if (prices[maxIndex] > maxPrice) {
    // maxPrice = prices[maxIndex];
    // maxProfit = maxPrice - minPrice;
    // } else {
    // minIndex++;
    // maxIndex--;
    // }
    // } while (minIndex <= maxIndex);
    // return maxProfit;
    // }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i : prices) {
            if (i < min) {
                min = i;
            } else if (i - min > profit) {
                profit = i - min;
            }
        }
        return profit;
    }
}
