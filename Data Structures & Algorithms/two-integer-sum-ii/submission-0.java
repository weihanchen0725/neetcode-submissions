class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int index = 0; index < numbers.length; index++){
            int currentNumber = numbers[index];
            int tempTarget = target - currentNumber;
            if(hmap.containsKey(tempTarget)){
                return new int[]{hmap.get(tempTarget)+1, index+1};
            }
            hmap.put(currentNumber, index);
        }
        return new int[2];
    }
}
