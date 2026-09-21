class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        results = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, new ArrayList<>(), nums);
        return results;
    }
    private void backtrack(int i, List<Integer> subset, int[] nums){
        results.add(new ArrayList<>(subset));
        for(int j = i; j < nums.length; j++){
            if(j > i && nums[j] == nums[j-1]) continue;
            subset.add(nums[j]);
            backtrack(j + 1, subset, nums);
            subset.remove(subset.size()-1);
        }
    }
}
