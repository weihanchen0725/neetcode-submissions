class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int counts = 1, maxCounts = counts;
        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index++){
            int currentNum = nums[index];
            int previousNum = nums[index-1];
            if(currentNum != previousNum){
                if(currentNum == previousNum+1){
                counts++;
                }else{
                    maxCounts = (counts > maxCounts) ? counts : maxCounts;
                    counts = 1;
                    
                }
            }
        }
        return (counts > maxCounts) ? counts : maxCounts;
    }
}
