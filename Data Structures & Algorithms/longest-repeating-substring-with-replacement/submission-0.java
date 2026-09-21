class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            HashMap<Character, Integer> hmap = new HashMap<>();            
            int maxValue = 0;
            for(int j = i; j < s.length(); j++){
                hmap.put(s.charAt(j), hmap.getOrDefault(s.charAt(j), 0) + 1);
                maxValue = Math.max(maxValue, hmap.get(s.charAt(j)));
                if((j - i + 1) - maxValue <= k){
                    result = Math.max((j - i + 1), result);
                }
            }
        }
        return result;
    }
}
