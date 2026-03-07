class Solution {
    public int maxProfit(int[] prices) {
        // Buy the stock whenever there's a rise in price next day
        // Sell the stock on next day

        // In short adding up the differences between consecutive prices
        // when price[i] < price[i+1]

        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if (prices[i+1] > prices[i]){
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }
}