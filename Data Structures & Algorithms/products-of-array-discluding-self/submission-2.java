class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int index = 1; index < nums.length; index++){
            result[index] = result[index-1] * nums[index-1];
        }
        int postNum = 1;
        for(int index = nums.length - 1; index >= 0; index--){
            result[index] *= postNum;
            postNum *= nums[index];
        }
        return result;
    }
}  
