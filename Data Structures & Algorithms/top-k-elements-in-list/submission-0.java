class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums) hmap.put(num, hmap.getOrDefault(num, 0)+1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int num : hmap.keySet()){
            int[] tempSet = {hmap.get(num), num};
            pq.add(tempSet);
        }
        ArrayList<Integer> tempResults = new ArrayList<>();
        while(k > 0){
            int[] tempResult = pq.poll();
            tempResults.add(tempResult[1]);
            k--;
        }
        int[] results = new int[tempResults.size()];
        for(int index = 0; index < results.length; index++){
            results[index] = tempResults.get(index);
        }
        return results;
    }
}
