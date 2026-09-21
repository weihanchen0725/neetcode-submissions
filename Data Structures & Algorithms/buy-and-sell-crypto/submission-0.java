class Solution {
    public int maxProfit(int[] prices) {
        int maxValue = 0;
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                maxValue = (prices[j] - prices[i] > maxValue) ? prices[j] - prices[i] : maxValue ;
            }
        }
        return maxValue;
    }
}
