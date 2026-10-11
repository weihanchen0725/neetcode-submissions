class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> results = new HashSet<>();
        for(int index = 0; index < nums.length - 2; index++){
            int currentNum = nums[index];
            int left = index + 1;
            int right = nums.length - 1;
            while(left < right){
                int leftNum = nums[left];
                int rightNum = nums[right];
                int totalSum = currentNum + leftNum + rightNum;
                if(totalSum == 0){
                    List<Integer> tempSetResult = Arrays.asList(currentNum, leftNum, rightNum);
                    results.add(tempSetResult);
                    while(left < right && leftNum == nums[left+1]) left++;
                    while(left < right && rightNum == nums[right-1]) right--;
                    left++;
                    right--;
                }else{
                    if(totalSum > 0){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList(results);
    }
}
