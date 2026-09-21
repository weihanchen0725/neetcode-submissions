class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        results = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, new ArrayList<>(), 0, nums, target);
        return results;
    }
    private void dfs(int i, List<Integer> currentList, int currentTotal, int[] nums, int target){
        if(currentTotal == target) {
            results.add(new ArrayList<>(currentList));
            return;
        }
        for(int index = i; index < nums.length; index++){
            if(currentTotal + nums[index] > target) return;
            currentList.add(nums[index]);
            dfs(index, currentList, currentTotal + nums[index], nums, target);
            currentList.remove(currentList.size()-1);
        }
    }
}
