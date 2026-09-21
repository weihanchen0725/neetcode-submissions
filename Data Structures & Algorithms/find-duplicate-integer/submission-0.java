class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int num : nums){
            if(!hset.add(num)){
                return num;
            }
        }
        return -1;
    }
}
