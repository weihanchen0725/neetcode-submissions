class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length; 
        Arrays.sort(nums);
        int counts = 1; 
        int maxCounts = counts; 
        for(int i = 1; i < nums.length; i++){
            int currNum = nums[i];
            int prevNum = nums[i-1];
            if(currNum != prevNum){
                if(prevNum == currNum - 1){
                    counts++;
                } else {
                    maxCounts = (counts > maxCounts) ? counts : maxCounts;
                    counts = 1;
                }
            }
        }
        return (counts > maxCounts) ? counts : maxCounts;
    }
}
