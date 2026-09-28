class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length; 
        int[] result = new int[length];
        result[0] = 1;
        for(int index = 1; index < nums.length; index++){
            result[index] = result[index-1] * nums[index-1];
        }
        int postNum = 1;
        for(int index = length - 1; index >= 0; index--){
            result[index] *= postNum;
            postNum *= nums[index];
        }
        return result;
    }
}  
