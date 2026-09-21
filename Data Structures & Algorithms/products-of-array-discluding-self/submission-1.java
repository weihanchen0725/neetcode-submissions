class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = 1;
        for(int index = 1; index < nums.length; index++){
            results[index] = results[index-1] * nums[index-1];
        }
        int postNum = 1;
        for(int index = nums.length - 1; index >= 0; index--){
            results[index] *= postNum;
            postNum *= nums[index];
        }
        return results;
    }
}  
