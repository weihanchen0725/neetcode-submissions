class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        List<Integer> numList = new ArrayList<>(hmap.keySet());
        numList.sort((a,b) -> Integer.compare(
            hmap.get(b), hmap.get(a)
        ));
        
        int[] results = new int[k];
        for(int index = 0; index < k; index++){
            results[index] = numList.get(index);
        }

        return results;
    }
}
