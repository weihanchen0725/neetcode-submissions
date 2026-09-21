class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for(int p : piles) right = p > right ? p : right;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(canFinish(piles, mid, h)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canFinish(int[] piles, int speed, int maxHours){
        int hoursSpent = 0;
        for(int p : piles){
            hoursSpent += Math.ceil((double)p / speed);
        }
        return hoursSpent <= maxHours;
    }
}
