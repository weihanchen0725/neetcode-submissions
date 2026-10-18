class Solution {
    public int maxProfit(int[] prices) {
        int maxProfits = 0, minPrice = Integer.MAX_VALUE;

        for(int index = 0; index < prices.length; index++){
            minPrice = Math.min(minPrice, prices[index]);
            maxProfits = Math.max(maxProfits, prices[index] - minPrice);
        }

        return maxProfits;
    }
}
