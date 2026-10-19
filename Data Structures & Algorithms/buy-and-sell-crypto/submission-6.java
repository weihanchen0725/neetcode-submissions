class Solution {
    public int maxProfit(int[] prices) {
        int maxValue = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxValue = Math.max(maxValue, prices[i] - minPrice);
        }

        return maxValue;
    }
}
