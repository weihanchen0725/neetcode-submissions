class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int currentNum = nums[index];
            int tempTarget = target - currentNum;
            if(hmap.containsKey(tempTarget)){
                return new int[]{hmap.get(tempTarget), index};
            }
            hmap.put(currentNum, index);
        }
        return new int[2];
    }
}
