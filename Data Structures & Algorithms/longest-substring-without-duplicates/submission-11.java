class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128]; 
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            left = Math.max(left, charIndex[c]);
            result = Math.max(result, right - left + 1);
            charIndex[c] = right + 1; 
        }

        return result;
    }
}