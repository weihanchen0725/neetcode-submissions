class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int num : hand){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }
        
        for(int num : hand){
            int start = num;
            while(hmap.getOrDefault(start - 1, 0) > 0) start--;
            while(start <= num){
                while(hmap.getOrDefault(start, 0) > 0){
                    for(int index = start; index < start + groupSize; index++){
                        if(hmap.getOrDefault(index, 0) == 0) return false;
                        hmap.put(index, hmap.get(index) -1);
                    }
                }
                start++;
            }
        }
        return true;
    }
}
