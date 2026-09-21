class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> permute(int[] nums) {
        results = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, new boolean[nums.length]);
        return results;
    }
    public void backtrack(List<Integer> perm, int[] nums, boolean[] pick){
        if(perm.size() == nums.length){
            results.add(new ArrayList<>(perm));
            return;
        }
        for(int index = 0; index < nums.length; index++){
            if(!pick[index]){
                perm.add(nums[index]);
                pick[index] = true;
                backtrack(perm, nums, pick);
                perm.remove(perm.size()-1);
                pick[index] = false;
            }
        }
    }
}
