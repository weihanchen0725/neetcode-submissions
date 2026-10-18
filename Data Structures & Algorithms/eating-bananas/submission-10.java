class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;
        
        for(int pile : piles){
            right = Math.max(pile, right);
        }

        int result = right;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            long hours = 0;
            for(int pile : piles){
                hours += Math.ceil((double)pile/mid);
            }
            if(hours <= h){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return result;
    }
}
