class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        Set<Integer> hSet = new HashSet<>();

        for(int[] t : triplets){
            if(t[0] > target[0] || t[1] > target[1] || t[2] > target[2]){
                continue;
            }
            for(int index = 0; index < t.length; index++){
                if(t[index] == target[index]){
                    hSet.add(index);
                }
            }
        }
        return hSet.size() == 3;
    }
}
