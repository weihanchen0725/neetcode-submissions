class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;

        while(left < right){
            int leftNumber = numbers[left];
            int rightNumber = numbers[right];
            int total = leftNumber + rightNumber;
            if(total == target){
                return new int[]{left+1, right+1};
            }else if(total < target){
                left++;
            }else{
                right--;
            }
            
        }
        return new int[2];
    }
}
