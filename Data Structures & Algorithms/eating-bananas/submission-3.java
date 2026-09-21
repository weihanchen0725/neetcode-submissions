class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0, right = Integer.MIN_VALUE;
        for(int p : piles) right = right > p ? right : p;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(canFinish(piles, h, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canFinish(int[] piles, int h, int speed){
        int hoursSpent = 0;
        for(int p : piles){
            hoursSpent += Math.ceil((double)p / speed);
        }
        return hoursSpent <= h;
    }
}
