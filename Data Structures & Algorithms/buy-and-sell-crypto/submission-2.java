class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = Integer.MAX_VALUE;

        for(int index = 0; index < prices.length; index++){
            minPrice = (minPrice < prices[index]) ? minPrice : prices[index];
            maxProfit = (prices[index] - minPrice > maxProfit) ? prices[index] - minPrice : maxProfit;
        }
        return maxProfit;
    }
}
