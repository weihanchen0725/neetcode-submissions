class Solution {
    public int maxProfit(int[] prices) {
        int maxValue = 0, minPrice = Integer.MAX_VALUE;
        for(int index = 0; index < prices.length; index++){
            minPrice = prices[index] < minPrice ? prices[index] : minPrice;
            maxValue = prices[index] - minPrice > maxValue ? (prices[index] - minPrice) : maxValue;
        }
        
        return maxValue;
    }
}
