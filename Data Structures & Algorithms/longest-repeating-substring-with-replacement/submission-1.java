class Solution {
    public int characterReplacement(String s, int k) {
        int maxCount = 0, maxLength = 0;
        int[] charMap = new int[26];
        for(int left=0, right=0; right < s.length(); right++){
            maxCount = Math.max(maxCount, ++charMap[s.charAt(right)-'A']);
            while(right-left+1-maxCount > k) charMap[s.charAt(left++)-'A']--;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
