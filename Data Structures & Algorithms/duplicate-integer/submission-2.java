class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int num : nums){
            if(!hset.add(num)){
                return true;
            }
        }
        return false;
    }
}
