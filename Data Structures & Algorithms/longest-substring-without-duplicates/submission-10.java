class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 128 covers all standard ASCII characters
        int[] charIndex = new int[128]; 
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // If we've seen the character, jump 'left' directly to the right of its last occurrence
            left = Math.max(left, charIndex[c]);
            
            result = Math.max(result, right - left + 1);
            
            // Store the next index where we'd want 'left' to jump if we see this char again
            charIndex[c] = right + 1; 
        }

        return result;
    }
}