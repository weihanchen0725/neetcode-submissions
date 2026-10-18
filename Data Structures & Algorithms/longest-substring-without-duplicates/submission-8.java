class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int left = 0, result = 0;
        for(int right = 0; right < s.length(); right++){
            while(hset.contains(s.charAt(right))){
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(s.charAt(right));
            result = (right - left + 1) > result ? (right - left + 1) : result;
        }
        return result;
    }
}
