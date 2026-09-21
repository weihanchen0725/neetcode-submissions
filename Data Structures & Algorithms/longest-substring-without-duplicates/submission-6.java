class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int index = 0; index < s.length(); index++){
            HashSet<Character> hset = new HashSet<>();
            for(int i = index; i < s.length(); i++){
                if(hset.contains(s.charAt(i))){
                    break;
                }
                hset.add(s.charAt(i));
            }
            result = hset.size() > result ? hset.size() : result;
        }
        return result;
    }
}
