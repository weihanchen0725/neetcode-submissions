class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            if(buckets[count] == null){
                buckets[count] = new ArrayList<>();
            }
            
            buckets[count].add(num);
        }

        int[] results = new int[k];
        int i = 0; 
        for(int count = buckets.length - 1; count >= 1 && i < k; count--){
            if(buckets[count] == null) continue;
            for(int num : buckets[count]){
                results[i++] = num;
                if(i == k){
                    return results;
                }
            }
        }

        return results;
    }
}
