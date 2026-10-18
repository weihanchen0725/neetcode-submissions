class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCounts = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // 1. Add the current right character to our frequency map
            int rightCharIndex = s.charAt(right) - 'A';
            charCounts[rightCharIndex]++;
            
            // 2. Track the most frequent character in the current window
            maxFreq = Math.max(maxFreq, charCounts[rightCharIndex]);

            // 3. If the characters needing replacement exceed k, shrink the window from the left
            if ((right - left + 1) - maxFreq > k) {
                int leftCharIndex = s.charAt(left) - 'A';
                charCounts[leftCharIndex]--;
                left++;
            }

            // 4. Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}