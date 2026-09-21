class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1, maxWater = 0;
        while(left < right){
            int minHeight = (heights[left] < heights[right]) ? heights[left] : heights[right];
            int width = right - left;
            maxWater = (minHeight * width > maxWater) ? minHeight * width : maxWater;
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
