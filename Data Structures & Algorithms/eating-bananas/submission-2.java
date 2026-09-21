class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Integer.MIN_VALUE;
        for(int pile : piles) maxPile = pile > maxPile ? pile : maxPile;
        for(int index = 1; index <= maxPile; index++){
            if(canFinish(piles, h, index)){
                return index;
            }
        }
        return maxPile == Integer.MIN_VALUE ? 0 : maxPile;
    }
    private boolean canFinish(int[] piles, int h, int speed){
        int hoursSpent = 0;
        for(int pile : piles){
            hoursSpent += Math.ceil((double) pile / speed);            
        }
        return hoursSpent <= h;
    }
}
 