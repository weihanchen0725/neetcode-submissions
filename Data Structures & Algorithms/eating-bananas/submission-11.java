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
                // 使用純整數向上取整技巧，替代 Math.ceil((double)pile/mid)
                hours += (pile + mid - 1) / mid;
            }
            
            if(hours <= h){
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
}