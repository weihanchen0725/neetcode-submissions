class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> permute(int[] nums) {
        results = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, new boolean[nums.length]);
        return results;
    }
    private void backtrack(List<Integer> temp, int[] nums, boolean[] visited){
        if(temp.size() == nums.length){
            results.add(new ArrayList<>(temp));
            return;
        }
        for(int index = 0; index < nums.length; index++){
            if(!visited[index]){
                temp.add(nums[index]);
                visited[index] = true;
                backtrack(temp, nums, visited);
                temp.remove(temp.size()-1);
                visited[index] = false;
            }
        }
    }
}
