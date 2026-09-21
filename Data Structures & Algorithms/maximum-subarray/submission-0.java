class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length, result = nums[0];
        for(int index = 0; index < length; index++){
            int current = 0;
            for(int jIndex = index; jIndex < length; jIndex++){
                current += nums[jIndex];
                result = Math.max(result, current);
            }
        }
        return result;
    }
}
