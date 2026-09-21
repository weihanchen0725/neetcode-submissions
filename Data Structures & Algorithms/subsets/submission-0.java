class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<>());
        for(int num : nums){
            int size = results.size();
            for(int index = 0; index < size; index++){
                List<Integer> temp = new ArrayList<>(results.get(index));
                temp.add(num);
                results.add(temp);
            }
        }
        return results;
    }
}
