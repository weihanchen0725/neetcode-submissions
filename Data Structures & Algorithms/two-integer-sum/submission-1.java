class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int currentNum = nums[index];
            int currentDiff = target - currentNum;
            if(hmap.containsKey(currentDiff)){
                return new int[]{hmap.get(currentDiff), index};
            }
            hmap.put(currentNum, index);
        }
        return new int[]{};
    }
}
