class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int newTarget = target - numbers[i];
            if(hmap.containsKey(newTarget)){
                return new int[]{hmap.get(newTarget)+1, i+1};
            }
            hmap.put(numbers[i],i);
        }
        return new int[2];
    }
}
