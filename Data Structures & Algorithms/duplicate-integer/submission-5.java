class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index++){
            int currentNum = nums[index];
            int previousNum = nums[index-1];
            if(currentNum == previousNum) return true;
        }
        return false;
    }
}