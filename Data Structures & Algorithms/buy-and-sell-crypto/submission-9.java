class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int index = 0; index < prices.length; index++){
            int currPrice = prices[index];
            minPrice = Math.min(minPrice, currPrice);
            maxValue = Math.max(maxValue, currPrice - minPrice);
        }

        return maxValue;
    }
}
