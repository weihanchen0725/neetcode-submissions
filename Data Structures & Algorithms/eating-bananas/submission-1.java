class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1, max = 0;
        for(int pile : piles) max = (pile > max) ? pile : max;
        while(min < max){
            int mid = min + (max - min) / 2;
            if(canFinish(piles, mid, h)){
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        return min;
    }
    private boolean canFinish(int[] piles, int k, int h){
        int totalHours = 0;
        for(int pile : piles){
            totalHours += (pile + k - 1) / k;
        }
        return totalHours <= h;
    }
}
