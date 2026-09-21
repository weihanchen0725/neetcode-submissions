class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        results = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, new ArrayList<>(), 0, nums, target);
        return results;
    }

    private void dfs(int index, List<Integer> current, int total, int[] nums, int target){
        if(total == target){
            results.add(new ArrayList<>(current));
            return;
        }
        for(int i = index; i < nums.length; i++){
            if(total + nums[i] > target) return;
            current.add(nums[i]);
            dfs(i, current, total + nums[i], nums, target);
            current.remove(current.size()-1);
        }
    }
}
