class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let left = 0;
        let right = heights.length - 1;
        let maxWater = 0;
        
        while(left < right){
            let currWidth = right - left;
            let minHeight = Math.min(heights[left], heights[right]);
            
            maxWater = Math.max(maxWater, currWidth * minHeight);
            
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater
    }
}
