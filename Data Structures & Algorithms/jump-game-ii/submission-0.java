class Solution {
    public int jump(int[] nums) {
        int result = 0, left = 0, right = 0, length = nums.length;
        while(right < length - 1){
            int farthest = 0;
            for(int index = left; index <= right; index++){
                farthest = Math.max(farthest, index + nums[index]);
            }
            left = right + 1;
            right = farthest;
            result++;
        }
        return result;
    }
}
