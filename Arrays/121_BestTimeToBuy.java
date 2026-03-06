class Solution {
    public int maxProfit(int[] prices) {
    
        int maxProfit = 0;
        int profit = 0;
        int minIndex = 0;

        for (int i = 0; i < prices.length; i++){
            // Keeping record of lowest price till now
            if (prices[i] < prices[minIndex]){
                minIndex = i;
            }
            // Calculating highest possible profit if sold on this day
            profit = prices[i] - prices[minIndex];
            if (profit > maxProfit){
                maxProfit = profit; 
            }
        }
        return maxProfit;
    }
}