class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        for(int index = 0; index < s.length(); index++){
            lastIndex.put(s.charAt(index), index);
        }

        List<Integer> results = new ArrayList<>();
        int size = 0, end = 0;
        for(int index = 0; index < s.length(); index++){
            size++;
            end = Math.max(end, lastIndex.get(s.charAt(index)));

            if(index == end){
                results.add(size);
                size = 0;
            }
        }
        return results;
    }
}
