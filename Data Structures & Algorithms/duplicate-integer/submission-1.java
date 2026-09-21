class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index++){
            if(nums[index] == nums[index-1]){
                return true;
            }else{
                continue;
            }
        }
        return false;
    }
}
