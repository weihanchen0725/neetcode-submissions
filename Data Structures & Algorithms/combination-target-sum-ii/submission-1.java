class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        results = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, new ArrayList<>(), 0, candidates, target);
        return results;
    }
    private void dfs(int i, List<Integer> currentList, int currentTotal, int[] candidates, int target){
        if(currentTotal == target){
            results.add(new ArrayList<>(currentList));
            return;
        }
        for(int index = i; index < candidates.length; index++){
            if(index > i && candidates[index] == candidates[index-1]) continue;
            if(currentTotal + candidates[index] > target) break;
            currentList.add(candidates[index]);
            dfs(index + 1, currentList, currentTotal + candidates[index], candidates, target);
            currentList.remove(currentList.size()-1);
        }
    }
}
